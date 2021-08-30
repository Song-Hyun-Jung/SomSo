package ddwucom.mobile.somso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class RuleIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule_iactivity);
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.rule_isolation_back:
                finish();
                break;
        }
    }
}