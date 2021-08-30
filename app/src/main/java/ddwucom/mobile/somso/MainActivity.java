package ddwucom.mobile.somso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent;
        switch(item.getItemId()){
            case R.id.pre_general:
                intent = new Intent(this, RuleGActivity.class);
                startActivity(intent);
                break;
            case R.id.pre_isolation:
                intent = new Intent(this, RuleIActivity.class);
                startActivity(intent);
                break;
            case R.id.pre_sign:
                intent = new Intent(this, RuleSActivity.class);
                startActivity(intent);
                break;
            case R.id.wash:
                intent = new Intent(this, WashActivity.class);
                startActivity(intent);
                break;
            case R.id.help:
                intent = new Intent(this, HelpActivity.class);
                startActivity(intent);
                break;
            case R.id.exit:
                finish();
                break;
        }
        return true;
    }
}