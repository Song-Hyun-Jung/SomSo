package ddwucom.mobile.somso;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DialogueActivity extends AppCompatActivity {
    ArrayList<Dialogue> dialogues = null;
    DialogueDBManager dialogueDBManager;
    ArrayList<String> ends = null;
    EndDBManager endDBManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue);

        dialogues = new ArrayList<>();
        dialogueDBManager = new DialogueDBManager(this);
        dialogues = dialogueDBManager.getAllDialogue();

        ends = new ArrayList<>();
        endDBManager = new EndDBManager(this);
        ends = endDBManager.getAllEnd();
    }
}
