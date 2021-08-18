package ddwucom.mobile.somso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final static int SUB_DIALOGUE_CODE = 100;
    final static int SUB_ATTEND_CODE = 101;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.btn_attend:
                intent = new Intent(this, AttendActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_dialogue:
                intent = new Intent(this, DialogueActivity.class);
                startActivity(intent);
                break;
        }
    }
}