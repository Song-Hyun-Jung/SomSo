package ddwucom.mobile.somso;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;


public class AttendDBManager {
    AttendDBHelper attendDBHelper = null;
    Cursor cursor2 = null;
    Attend attend = new Attend();

    public AttendDBManager(Context context) { attendDBHelper = new AttendDBHelper(context); }

    public Attend getAttendInfo() {

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

    public boolean attendLevelUP(Attend attend){
        SQLiteDatabase sqLiteDatabase = attendDBHelper.getWritableDatabase();
        int result = 0;

        if(attend.getStamp() == 1){
            ContentValues row = new ContentValues();
            row.put(AttendDBHelper.COL_ATTEND_LV, attend.getLevel() + 1);
            row.put(AttendDBHelper.COL_ATTEND_STAMP, 0);
            String whereClause = AttendDBHelper.COL_ATTEND_ID + "=?";
            String[] whereArgs = new String[] { String.valueOf(1)} ;
            result = sqLiteDatabase.update(AttendDBHelper.TABLE_ATTEND, row, whereClause, whereArgs);
            attendDBHelper.close();
        }
        if(attend.getStamp() == 0){
            return false;
        }
        if(result > 0) return true;
        return true;
    }

    public void addStamp(){
        SQLiteDatabase sqLiteDatabase = attendDBHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(attendDBHelper.COL_ATTEND_STAMP, 1);
        sqLiteDatabase.update(AttendDBHelper.TABLE_ATTEND, values, AttendDBHelper.COL_ATTEND_ID + "=" + 1, null);
    }
}
