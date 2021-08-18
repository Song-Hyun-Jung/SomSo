package ddwucom.mobile.somso;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DialogueDBHelper extends SQLiteOpenHelper {
    final static String TAG = "DialogueDBHelper";
    final static String DB_NAME = "dialogues.db";
    //대화 테이블
    public final static String TABLE_DIALOGUE = "dialogue_table";

    public final static String COL_DIALOGUE_ID = "_id";
    public final static String COL_DIALOGUE_QUE1 = "question1";
    public final static String COL_DIALOGUE_QUE2 = "question2";
    public final static String COL_DIALOGUE_QUE3 = "question3";
    public final static String COL_DIALOGUE_QUE4 = "question4";
    public final static String COL_DIALOGUE_QUE5 = "question5";
    public final static String COL_DIALOGUE_QUE6 = "question6";
    public final static String COL_DIALOGUE_CHECK = "done";


    public DialogueDBHelper(Context context){super(context, DB_NAME, null, 1);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        //대화 테이블 생성
        String sql_dialogue = "CREATE TABLE " + TABLE_DIALOGUE + " (" + COL_DIALOGUE_ID + " integer primary key autoincrement, " +
                COL_DIALOGUE_QUE1 + " TEXT, "+ COL_DIALOGUE_QUE2 + " TEXT, "+ COL_DIALOGUE_QUE3 + " TEXT, " +
                COL_DIALOGUE_QUE4 + " TEXT, " + COL_DIALOGUE_QUE5 + " TEXT, "+ COL_DIALOGUE_QUE6 + " TEXT, "+ COL_DIALOGUE_CHECK + " integer)";
        Log.d(TAG, sql_dialogue);
        db.execSQL(sql_dialogue);

        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 먹었던 가장 맛있는 음식이 뭐야?', '얼마나 자주 먹어?', '만들어 먹어본 적 있어?', '맛 표현 해줄 수 있어?', '최근에 먹었던 가장 별로였던 음식도 있어?', '어떤 재료가 별로였어?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '지금 가장 가고 싶은 곳이 어디야?', '누구랑 가고 싶어?', '가게 된다면 어떤 걸 하고 싶어?', '여행 계획을 세워보는 건 어떨까?', '여행 다녀온 사람들이 쓴 후기도 찾아봐!', '얼른 여행 갈 수 있으면 좋겠다!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 놀러 갔던 곳 중에 가장 좋았던 곳이 어디야?', '누구랑 갔었어?', '거기서 가장 인상깊었던 것이 뭐야?', '간다면 또 가고 싶어?', '기억할 만한 기념품도 있어?', '심심하다면 그때 찍은 사진 다시보는 건 어때?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '오늘은 뭐했어?', '힘든 일은 없었어?', '혹시 최근에 스트레스 받았던 일은 뭐야?', '힘들었겠다... 이젠 괜찮아?', '그래도 나쁜 일이 지나가면 좋은 일이 꼭 올거야~', '앞으로 힘든 일 모두 이겨낼 나한테 파이팅 하자!!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 들은 노래가 뭐야?', '혹시 뮤직 비디오도 봤었어? 어때?', '지금 듣고 싶은 노래 하나를 말한다면?', '플레이리스트에 어떤 노래 있어?', '노래 추천해 줄 수 있어?', '오늘 하루는 노래로 마무리 해보는 건 어때?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '혹시 사고 싶거나 갖고 싶은 물건이 있니?', '구하기 어려운 물건이야?', '혹시 앞으로 살 생각이 있어?', '갖게 된다면 어떨 것 같아?', '최근에 산 물건 중에 제일 마음에 든 건 어떤 거야?', '어떤 점이 마음에 들어?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 본 영화 있어?', '재미 있었어? 후기 들려줘!', '추천해 주고 싶은 영화 있어?', '최근에 본 가장 재미없었던 영화는 뭐야?', '그 영화에 관해서 다른 사람하고 얘기해 본 적이 있어?', '사람들의 평가는 어때?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '티비 보는 거 좋아해?', '요즘엔 주로 어떤 걸 봐?', '최근에 가장 재미있게 본 프로그램이 뭐야?', '티비에서 본 것 중에 하고 싶은거 있어?', '다시 보고 싶은 프로그램도 있어?', '티비에 출연하게 된다면 어떤 프로그램에 출연해보고 싶어?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 쇼핑 했어?', '어디에서 쇼핑했어?', '누구랑 같이 갔어? 아님 혼자?', '어떤 거 샀어?', '맘에 들어?', '못 사서 아쉬웠던 물건은 없었어?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '지금 가장 보고싶은 사람이 누구야?', '그 사람을 가장 최근에 만난 게 언제야?', '만약 만난다면 무슨 대화를 하고 싶어?', '함께 가고 싶은 곳이나 하고 싶은 거 있어?', '같이 먹고 싶은 건 뭐야?', '그 사람에게 주고 싶은 선물 같은거 있어?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '오늘 뭐 먹었어?', '맛있었어?', '너가 만들어 먹은거야?', '내일은 뭐 먹을거야?', '지금 먹고 싶은거나 먹어보고 싶은 음식은 없어?', '너만의 레시피를 만들어보는 것도 재밌을 것 같아!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 가장 뿌듯했던 순간은?', '너를 칭찬해 준 적이 있니?', '지금 너를 칭찬해준다면 어떤 말을 해주고 싶어?', '지금 잠시 폰을 내려놓고 거울 보고 너에게 칭찬해줘!', '스스로에게 칭찬해주니까 기분이 어때?', '앞으로 적어도 한 번씩은 스스로에게 칭찬해주기 하자!', 0);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DIALOGUE);
        onCreate(db);
    }
}
