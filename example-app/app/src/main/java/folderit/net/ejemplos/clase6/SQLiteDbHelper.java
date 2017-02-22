package folderit.net.ejemplos.clase6;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class SQLiteDbHelper extends SQLiteOpenHelper {

    private static final String TITLE = "title";
    private static final String VALUE = "value";
    private static final String DATABASE_NAME = "db";
    private static final String TABLE_NAME = "constants";


    private StringBuilder createTable = new StringBuilder()
            .append("create table ")
            .append(TABLE_NAME)
            .append(" (id integer primary key autoincrement, title text, value real);");

    public SQLiteDbHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        try {
            db.execSQL(createTable.toString());
        } catch (SQLiteException ex) {
            Log.v("Create table exception", ex.getMessage());
        }

        ContentValues mContentValues = new ContentValues();

        mContentValues.put(TITLE, "pi");
        mContentValues.put(VALUE, "3.141592");

        db.insert("constants", TITLE, mContentValues);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        switch (oldVersion) {
            case 1:
                //upgrade logic from version 1 to 2
                db.execSQL("drop table if exists constants");
                onCreate(db);
            case 2:
                //upgrade logic from version 2 to 3
            case 3:
                //upgrade logic from version 3 to 4
                break;
            default:
        }

    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onDowngrade(db, oldVersion, newVersion);
    }
}
