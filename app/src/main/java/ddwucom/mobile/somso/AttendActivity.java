package ddwucom.mobile.somso;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AttendActivity extends AppCompatActivity {
    AttendDBManager attendDBManager;
    Attend attendInfo = new Attend();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attend);

        attendDBManager = new AttendDBManager(this);
        attendInfo = attendDBManager.getAttendInfo();
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.btn_hello:
                attendDBManager.attendLevelUP(attendInfo);
        }
    }

}
