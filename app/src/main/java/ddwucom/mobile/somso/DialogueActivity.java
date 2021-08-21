package ddwucom.mobile.somso;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class DialogueActivity extends AppCompatActivity {
    Random random = new Random();

    ArrayList<Dialogue> dialogues = null;
    DialogueDBManager dialogueDBManager;
    ArrayList<String> ends = null;
    EndDBManager endDBManager;

    ArrayList<String> giveChat = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue);

        //대화 불러오기
        dialogues = new ArrayList<>();
        dialogueDBManager = new DialogueDBManager(this);
        dialogues = dialogueDBManager.getAllDialogue();

        ends = new ArrayList<>();
        endDBManager = new EndDBManager(this);
        ends = endDBManager.getAllEnd();

        //랜덤 세트 뽑기
        int pickSet = random.nextInt(dialogues.size());
        Dialogue pickDialogue = dialogues.get(pickSet);
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

    }
}
