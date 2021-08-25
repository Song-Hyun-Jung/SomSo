package ddwucom.mobile.somso;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class DialogueActivity extends AppCompatActivity {
    Random random = new Random();

    ArrayList<Dialogue> dialogues = null;
    DialogueDBManager dialogueDBManager;
    ArrayList<String> ends = null;
    EndDBManager endDBManager;
    AttendDBManager attendDBManager;

    ArrayList<String> giveChat = null;
    Dialogue pickDialogue;

    EditText putAnswer;
    Button sendAnswer;
    TextView txtQuestion;
    int count = 0;

    Button btn_goAttend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue);

        //출석도장 db
        attendDBManager = new AttendDBManager(this);
        btn_goAttend = (Button)findViewById(R.id.btn_goAttend);
        btn_goAttend.setVisibility(View.GONE);

        //대화 불러오기
        dialogues = new ArrayList<>();
        dialogueDBManager = new DialogueDBManager(this);
        dialogues = dialogueDBManager.getAllDialogue();
        if(dialogues.size() == 0) {
            dialogueDBManager.initDialogueCheck();
            dialogues = dialogueDBManager.getAllDialogue();
        }

        ends = new ArrayList<>();
        endDBManager = new EndDBManager(this);
        ends = endDBManager.getAllEnd();

        //랜덤 세트 뽑기
        int pickSet = random.nextInt(dialogues.size());
        pickDialogue = dialogues.get(pickSet);
        int pickEnd = random.nextInt(ends.size());
        String pickEndDialogue = ends.get(pickEnd);

        //하루 대화 선택
        giveChat = new ArrayList<>();
        giveChat.add(pickDialogue.getQuestion1());
        giveChat.add(pickDialogue.getQuestion2());
        giveChat.add(pickDialogue.getQuestion3());
        giveChat.add(pickDialogue.getQuestion4());

        giveChat.add(pickDialogue.getQuestion5());
        giveChat.add(pickDialogue.getQuestion6());
        giveChat.add(pickEndDialogue);

        Log.d("대화", giveChat.get(0));
        Log.d("대화", giveChat.get(1));
        Log.d("대화", giveChat.get(2));
        Log.d("대화", giveChat.get(3));
        Log.d("대화", giveChat.get(4));
        Log.d("대화", giveChat.get(5));
        Log.d("대화", giveChat.get(6));

        putAnswer = (EditText)findViewById(R.id.putAnswer);
        sendAnswer =  (Button)findViewById(R.id.sendAnswer);
        txtQuestion = (TextView)findViewById(R.id.txtQuestion);
        count = 0;

        txtQuestion.setText(giveChat.get(count));

    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.sendAnswer:
                if(count >= 6){
                    dialogueDBManager.changeCheckDialogueSet(pickDialogue);
                    attendDBManager.addStamp();
                    Log.d("대화", "db 변경 확인");
                    btn_goAttend.setVisibility(View.VISIBLE);
                }
                else {
                    if (putAnswer.getText().toString().equals("")) {
                        Toast.makeText(this, "대답해줘!", Toast.LENGTH_SHORT);
                    } else {
                        count += 1;
                        putAnswer.setText("");
                        txtQuestion.setText(giveChat.get(count));
                        Log.d("대화", String.valueOf(count));
                    }
                }
                break;
            case R.id.btn_goAttend:
                Intent intent = new Intent(this, AttendActivity.class);
                startActivity(intent);
                finish();
        }
    }
}
