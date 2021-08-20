package ddwucom.mobile.somso;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class EndDBManager {
    EndDBHelper endDBHelper = null;
    Cursor cursor3 = null;

    public EndDBManager(Context context) { endDBHelper = new EndDBHelper(context); }

    public ArrayList<String> getAllEnd() {
        ArrayList ends = new ArrayList();

        SQLiteDatabase db = endDBHelper.getWritableDatabase();
        cursor3 = db.rawQuery("SELECT * FROM " + EndDBHelper.TABLE_END, null);

        while(cursor3.moveToNext()){
            long id = cursor3.getInt(cursor3.getColumnIndex(EndDBHelper.COL_END_ID));
            String sentence = cursor3.getString(cursor3.getColumnIndex(EndDBHelper.COL_END_SENTENCE));

            ends.add(sentence);
        }

        cursor3.close();
        endDBHelper.close();
        return ends;
    }
}
