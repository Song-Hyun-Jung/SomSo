package ddwucom.mobile.somso;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DialogueDBManager {
    DialogueDBHelper dialogueDBHelper = null;
    Cursor cursor = null;

    public DialogueDBManager(Context context) { dialogueDBHelper = new DialogueDBHelper(context); }

    public ArrayList<Dialogue> getAllDialogue() {
        ArrayList dialogues = new ArrayList();

        SQLiteDatabase db = dialogueDBHelper.getWritableDatabase();
        cursor = db.rawQuery("SELECT * FROM " + DialogueDBHelper.TABLE_DIALOGUE + " WHERE " + DialogueDBHelper.COL_DIALOGUE_CHECK + " =" + 0, null);

        while(cursor.moveToNext()){
            long id = cursor.getInt(cursor.getColumnIndex(DialogueDBHelper.COL_DIALOGUE_ID));
            String question1 = cursor.getString(cursor.getColumnIndex(DialogueDBHelper.COL_DIALOGUE_QUE1));
            String question2 = cursor.getString(cursor.getColumnIndex(DialogueDBHelper.COL_DIALOGUE_QUE2));
            String question3 = cursor.getString(cursor.getColumnIndex(DialogueDBHelper.COL_DIALOGUE_QUE3));
            String question4 = cursor.getString(cursor.getColumnIndex(DialogueDBHelper.COL_DIALOGUE_QUE4));
            String question5 = cursor.getString(cursor.getColumnIndex(DialogueDBHelper.COL_DIALOGUE_QUE5));
            String question6 = cursor.getString(cursor.getColumnIndex(DialogueDBHelper.COL_DIALOGUE_QUE6));
            int check = cursor.getInt(cursor.getColumnIndex(DialogueDBHelper.COL_DIALOGUE_CHECK));

            dialogues.add(new Dialogue(id, question1, question2, question3, question4, question5, question6, check));
        }

        cursor.close();
        dialogueDBHelper.close();
        return dialogues;
    }

    public void initDialogueCheck(){
        SQLiteDatabase db = dialogueDBHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DialogueDBHelper.COL_DIALOGUE_CHECK, 0);
        db.update(DialogueDBHelper.TABLE_DIALOGUE, values, DialogueDBHelper.COL_DIALOGUE_CHECK + "=" + 1, null);
        dialogueDBHelper.close();
    }
}
