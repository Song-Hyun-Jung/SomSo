package ddwucom.mobile.somso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class RuleSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule_sactivity);
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.rule_sign_back:
                finish();
                break;
        }
    }
}