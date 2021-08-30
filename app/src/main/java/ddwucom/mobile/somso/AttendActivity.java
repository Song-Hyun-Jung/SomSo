package ddwucom.mobile.somso;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class AttendActivity extends AppCompatActivity {
    AttendDBManager attendDBManager;
    Attend attendInfo = new Attend();
    ImageView attendCharacter;
    TextView txtLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attend);

        attendDBManager = new AttendDBManager(this);
        attendInfo = attendDBManager.getAttendInfo();

        attendCharacter = (ImageView)findViewById(R.id.attendCharacter);

        if(attendInfo.getLevel() % 30 == 0)
            Glide.with(this).load(R.drawable.diecorona).into(attendCharacter);
        else
            Glide.with(this).load(R.drawable.fightcorona).into(attendCharacter);

        txtLV = (TextView)findViewById(R.id.txtLV);
        txtLV.setText("LV." + attendInfo.getLevel());
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.btn_hello:
                boolean levelUP = attendDBManager.attendLevelUP(attendInfo);

                if(levelUP == false)
                    Toast.makeText(this, "대화하고 오자!", Toast.LENGTH_SHORT).show();

                int presentLevel = attendDBManager.getAttendInfo().level;
                txtLV.setText("LV." + presentLevel);
                Log.d("레벨", String.valueOf(presentLevel));
                if(presentLevel % 30 == 0) {
                   // Toast.makeText(this, "30달성 싸우기", Toast.LENGTH_SHORT).show();
                    attendCharacter.setImageResource(R.drawable.diecorona);
                    Glide.with(this).load(R.drawable.diecorona).into(attendCharacter);
                }
                else{
                    attendCharacter.setImageResource(R.drawable.fightcorona);
                    Glide.with(this).load(R.drawable.fightcorona).into(attendCharacter);
                }
                break;
        }
    }

}
