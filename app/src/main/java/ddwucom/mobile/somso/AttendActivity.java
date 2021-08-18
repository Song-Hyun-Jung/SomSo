package ddwucom.mobile.somso;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AttendActivity extends AppCompatActivity {
    AttendDBManager attendDBManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attend);

        attendDBManager = new AttendDBManager(this);
        attendDBManager.getAttendStamp();
    }
}
