package ddwucom.mobile.somso;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class AttendDBManager {
    AttendDBHelper attendDBHelper = null;
    Cursor cursor2 = null;

    public AttendDBManager(Context context) { attendDBHelper = new AttendDBHelper(context); }

    public Attend getAttendStamp() {
        Attend attend = new Attend();

        SQLiteDatabase db = attendDBHelper.getWritableDatabase();

        cursor2 = db.rawQuery("SELECT * FROM " + AttendDBHelper.TABLE_ATTEND, null);

        while(cursor2.moveToNext()){
            int level = cursor2.getInt(cursor2.getColumnIndex(AttendDBHelper.COL_ATTEND_LV));
            int stamp = cursor2.getInt(cursor2.getColumnIndex(AttendDBHelper.COL_ATTEND_STAMP));
            attend = new Attend(level, stamp);
        }

        cursor2.close();
        attendDBHelper.close();
        return attend;
    }
}
