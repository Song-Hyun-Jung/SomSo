package ddwucom.mobile.somso;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

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
                int presentLevel = attendDBManager.attendLevelUP(attendInfo);
                Log.d("레벨", String.valueOf(presentLevel));

                if(presentLevel == -1)
                    Toast.makeText(this, "대화하고 오자!", Toast.LENGTH_SHORT).show();
                if(presentLevel % 30 == 0)
                   Toast.makeText(this, "30달성 싸우기", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
