package ddwucom.mobile.somso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class RuleGActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule_gactivity);
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.rule_general_back:
                finish();
                break;
        }
    }
}