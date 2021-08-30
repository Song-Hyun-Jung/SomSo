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

        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 먹었던 가장 맛있는 음식이 뭐야?', '얼마나 자주 먹어?', '만들어 먹어본 적 있어?', '맛 표현 해줄 수 있어?', '최근에 먹었던 가장 별로였던\n음식도 있어?', '어떤 재료가 별로였어?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '지금 가장 가고 싶은 곳이 어디야?', '누구랑 가고 싶어?', '가게 된다면 어떤 걸 하고 싶어?', '여행 계획을 세워보는 건 어떨까?', '여행 다녀온 사람들이 쓴 후기도 찾아봐!', '얼른 여행 갈 수 있으면 좋겠다!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 놀러 갔던 곳 중에\n가장 좋았던 곳이 어디야?', '누구랑 갔었어?', '거기서 가장 인상깊었던 것이 뭐야?', '간다면 또 가고 싶어?', '기억할 만한 기념품도 있어?', '심심하다면 그때 찍은 사진\n다시보는 건 어때?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '오늘은 뭐했어?', '힘든 일은 없었어?', '혹시 최근에 스트레스 받았던 일은 뭐야?', '힘들었겠다... 이젠 괜찮아?', '그래도 나쁜 일이 지나가면\n좋은 일이 꼭 올거야~', '앞으로 힘든 일 모두 이겨낼\n나한테 파이팅 하자!!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 들은 노래가 뭐야?', '혹시 뮤직 비디오도 봤었어? 어때?', '지금 듣고 싶은 노래 하나를 말한다면?', '플레이리스트에 어떤 노래 있어?', '노래 추천해 줄 수 있어?', '오늘 하루는 노래로\n마무리 해보는 건 어때?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '혹시 사고 싶거나 갖고 싶은 물건이 있니?', '구하기 어려운 물건이야?', '혹시 앞으로 살 생각이 있어?', '갖게 된다면 어떨 것 같아?', '최근에 산 물건 중에\n제일 마음에 든 건 어떤 거야?', '어떤 점이 마음에 들어?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 본 영화 있어?', '재미 있었어? 후기 들려줘!', '추천해 주고 싶은 영화 있어?', '최근에 본 가장 재미없었던 영화는 뭐야?', '그 영화에 관해서 다른 사람하고\n얘기해 본 적이 있어?', '사람들의 평가는 어때?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '티비 보는 거 좋아해?', '요즘엔 주로 어떤 걸 봐?', '최근에 가장 재미있게\n본 프로그램이 뭐야?', '티비에서 본 것 중에 하고 싶은거 있어?', '다시 보고 싶은 프로그램도 있어?', '티비에 출연하게 된다면\n어떤 프로그램에 출연해보고 싶어?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 쇼핑 했어?', '어디에서 쇼핑했어?', '누구랑 같이 갔어? 아님 혼자?', '어떤 거 샀어?', '맘에 들어?', '못 사서 아쉬웠던 물건은 없었어?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '지금 가장 보고싶은 사람이 누구야?', '그 사람을 가장 최근에 만난 게 언제야?', '만약 만난다면\n무슨 대화를 하고 싶어?', '함께 가고 싶은 곳이나\n하고 싶은 거 있어?', '같이 먹고 싶은 건 뭐야?', '그 사람에게 주고 싶은 선물 같은거 있어?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '오늘 뭐 먹었어?', '맛있었어?', '너가 만들어 먹은거야?', '내일은 뭐 먹을거야?', '지금 먹고 싶은거나\n먹어보고 싶은 음식은 없어?', '너만의 레시피를\n만들어보는 것도 재밌을 것 같아!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 가장 뿌듯했던 순간은?', '너를 칭찬해 준 적이 있니?', '지금 너를 칭찬해준다면\n어떤 말을 해주고 싶어?', '지금 잠시 폰을 내려놓고\n거울 보고 너에게 칭찬해줘!', '스스로에게 칭찬해주니까 기분이 어때?', '앞으로 하루에 한 번씩은\n스스로에게 칭찬해주기 하자!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '요즘 힘들었던 일 많았어?', '최근에 가장 힘들었던 순간은?', '어떤 게 너를 힘들게 했어?', '지금은 괜찮아?', '그렇구나...\n이 일을 통해서 어떤 걸 느꼈어?', '앞으로 비슷한 상황을 마주한다해도\n너는 이겨낼 수 있을거야!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 가장 즐거웠던 순간은 언제야?', '그 순간에 어울리는 노래를 뽑는다면\n어떤 노래가 좋을까?', '잘 어울릴 것 같아!\n그때를 회상하면서 그 노래를 들어보는 건 어때?\n기분이 좋아질거야!', '앞으로 일정 중에 기대되는 거 있어?', '그게 왜 가장 기대돼?', '오~ 기대되겠다!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '오늘 잠은 푹 잤어?', '얼마나 잤어?', '꿈을 꾸지는 않았어?', '최근에 꾼 좋은 꿈 얘기해줘!', '혹시 최근에 나쁜 꿈도 꿨어?', '꿈 속에서 꿈인 걸 알았어?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '요즘 운동은 하고 있어?', '혹시 집 안에만 있었어?', '최근에 가장 많이 운동한 날은 언제야?', '운동 얼마나 했어?', '도전해보고 싶은 운동은 없어?', '가벼운 산책이라도 나가보는건 어때?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '오늘 기분은 어땠어?', '피곤하진 않았어?', '혹시 요즘 고민은 없어?', '주변에 털어놓아봤어?', '혹시 해결책은 찾았어?', '꼭 그 고민이 얼른 해결되면 좋겠다...!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 통화한 적 있어?', '즐거운 대화였어?', '지금 누군가와\n통화하고 싶지는 않아?', '전화로 무슨 얘기 하고 싶어?', '누군가에게 전화 걸어보는건 어때?', '그 사람도 너의 전화를\n기다리고 있을거야!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 상상같은거 해봤어?', '어떤 상상이었어?', '그 상상이 현실이 된다면 어떨 것 같아?', '평소에 상상하는 거 좋아해?', '만약 지금 시간 여행을 한다면\n언제로 가고 싶어?', '이유도 알려줘!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '다가오는 특별한 날이 있어?', '있다면 그날에 뭐할거야?', '누구랑 같이 보낼거야?', '기념일에 좋은 추억이 있다면 어떤 거야?', '일주일 뒤에 너는\n무엇을 하고 있을지 생각해봤어?', '일주일 계획을 세워봐!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '아픈 데는 없어?', '영양제도 먹어줘!', '혹시 식사를 거르고 있는건 아니지?', '최근에 먹은 건강에 좋은 식단이 뭐야?', '오늘 물은 몇 잔 먹었어?', '물을 많이 먹어야 건강에 좋대!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '요즘 뭐하고 지내?', '심심하진 않아?', '취미활동 해보는 건 어때?\n짧게라도 괜찮아!', '요즘 보석십자수나 피포페인팅\n같은 것들이 유행이더라고!\n해본 적 있어?', '한번 해보는 건 어때? 재밌을거야!', '그림이나 낙서도 스트레스 해소에\n좋을 것 같아!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '창밖은 바라봤어?', '날씨는 어때?', '어떤 게 있었어?', '나가고 싶어지지 않아?\n나가서 동네 한바퀴 돌고 오는 건 어때?', '바깥 공기를 마시면 기분이 좋아질거야!', '자전거나 킥보드 같은 거도 타봐!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '청소는 얼마나 자주 하고 있어?', '환기도 해주고 있지?', '심심하다면 주변이라도 살짝 정리해봐!', '정리할 땐 귀찮아도\n하고 나면 깔끔하고 뿌듯할 거야!', '혹시 방 안 가구 배치를 바꾸거나\n새로운 소품을 놓을 생각은 없어?', '버리고 싶은 물건이나\n팔고 싶은 물건은 없어?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '요즘 하고 있는 공부 있어?', '그 공부를 시작하게 된 계기는 뭐야?', '우와 대단하다 어떻게 공부하고 있어?', '지루하다면 새로운 걸\n시도해보는 건 어때?', '또 하고 싶은 공부 있어?', '책도 읽어보는 건 어때?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근 가장 큰 이슈가 뭘까?', '그거에 대해 너는 어떻게 생각해?', '다른 사람의 생각도 들어본 적 있어?', '새로 알게 된 정보도 있어?', '요즘의 트렌드는 뭐야?', '어떻게 알게 됐어?', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 본 인상깊은\n문구 같은 거 있어?', '너에게 도움이 되었니?', '요즘 유행어는 뭐야?', '너도 자주 쓰고 있어?', '너의 좌우명은 어떤 거야?', '그 좌우명을 항상 잊지 않길 바래!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '최근에 게임 같은 거 했어?', '어떤 게임이야?', '어떻게 그 게임을 시작하게 됐어?', '재밌었어?', '또 해보고 싶은 게임 있어?', '나한테 게임 하나만 추천해줘!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '여태까지 어떤 헤어스타일 해봤어?', '그 중 어떤 게 제일 마음에 들어?', '혹시 헤어스타일을 바꾸고 싶진 않아?', '어떤 스타일로 바꿔보고 싶어?', '한 번 변화를 줘보는건 어때?\n기분 전환에 도움이 될거야!', '어떤 모습으로 바뀔 지 기대된다!', 0);");
        db.execSQL("insert into " + TABLE_DIALOGUE + " values (null, '혹시 지금 잊고 있는 건 없어?', '기억력 향상에 도움되는 걸\n해보는건 어때?', '눈건강은 괜찮아?', '눈운동도 해줘!', '지금 잠시 폰을 내려놓고\n눈 세바퀴 돌리고 오자!', '어때?\n눈이 좀 더 잘 보이는 거 같지 않아?', 0);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DIALOGUE);
        onCreate(db);
    }
}
