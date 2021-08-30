package ddwucom.mobile.somso;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class AttendDBHelper extends SQLiteOpenHelper {
    final static String TAG = "DialogueDBHelper";
    final static String DB_NAME = "attends.db";

    //출석도장 캐릭터 테이블
    public final static String TABLE_ATTEND = "attend_table";

    public final static String COL_ATTEND_ID = "_id";
    public final static String COL_ATTEND_LV = "level";
    public final static String COL_ATTEND_STAMP = "stamp";

    public AttendDBHelper(Context context){super(context, DB_NAME, null, 1);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        //출석도장 테이블 생성
        String sql_attend = "CREATE TABLE " + TABLE_ATTEND + " (" + COL_ATTEND_ID + " integer primary key autoincrement, " + COL_ATTEND_LV + " integer, " + COL_ATTEND_STAMP + " integer)";
        Log.d(TAG, sql_attend);
        db.execSQL(sql_attend);

        db.execSQL("insert into " + TABLE_ATTEND + " values (null, 1, 0);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ATTEND);
        onCreate(db);
    }

}
