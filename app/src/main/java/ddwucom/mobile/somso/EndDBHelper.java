package ddwucom.mobile.somso;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class EndDBHelper extends SQLiteOpenHelper {
    final static String TAG = "EndDBHelper";
    final static String DB_NAME = "ends.db";
    //대화 테이블
    public final static String TABLE_END = "end_table";

    public final static String COL_END_ID = "_id";
    public final static String COL_END_SENTENCE= "sentence";

    public EndDBHelper(Context context){super(context, DB_NAME, null, 1);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        //대화 테이블 생성
        String sql_end = "CREATE TABLE " + TABLE_END + " (" + COL_END_ID + " integer primary key autoincrement, " +
                COL_END_SENTENCE + " TEXT)";
        Log.d(TAG, sql_end);
        db.execSQL(sql_end);

        db.execSQL("insert into " + TABLE_END + " values (null, '오늘도 너와 얘기할 수 있어서 즐거웠어!');");
        db.execSQL("insert into " + TABLE_END + " values (null, '수고했어, 오늘도. 내일 또 보자!');");
        db.execSQL("insert into " + TABLE_END + " values (null, '내일도 얘기하자!');");
        db.execSQL("insert into " + TABLE_END + " values (null, '오늘 힘들었지? 오늘은 이만 푹 쉬어!');");
        db.execSQL("insert into " + TABLE_END + " values (null, '오늘 하루도 잘 지낸 너가 자랑스러워! 내일도 파이팅!');");
        db.execSQL("insert into " + TABLE_END + " values (null, '오늘 고생했어! 나는 네 편이라는 걸 잊지마! 내일 봐!');");
        db.execSQL("insert into " + TABLE_END + " values (null, '내일은 즐거운 일만 있기를 바랄게!');");
        db.execSQL("insert into " + TABLE_END + " values (null, '내일도 건강한 모습으로 만나자!');");
        db.execSQL("insert into " + TABLE_END + " values (null, '나를 만나러 와줘서 고마워! 내일도 만나러 와!');");
        db.execSQL("insert into " + TABLE_END + " values (null, '내일도 여기서 널 기다리고 있을게! 안녕!');");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_END);
        onCreate(db);
    }
}
