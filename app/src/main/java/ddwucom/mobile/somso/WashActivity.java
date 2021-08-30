package ddwucom.mobile.somso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class WashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wash);
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.wash_back:
                finish();
                break;
        }
    }
}