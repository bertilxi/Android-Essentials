package folderit.net.ejemplos.clase4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MyDbHelper extends SQLiteOpenHelper {
    private static final String CREATE_TABLE = "create table " + Constants.TABLE_NAME +
            " (" + Constants.KEY_ID + " integer primary key autoincrement, " + Constants.NOMBRE+
            " text not null, " + Constants.PRECIO + " text not null, " + Constants.FECHA_CREACION +
            " long);";

    public MyDbHelper(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.v("MyDBhelper onCreate", "Creating all the tables");
        try {
            db.execSQL(CREATE_TABLE);
        } catch (SQLiteException ex) {
            Log.v("Create table exception", ex.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) {
        Log.w("TaskDBAdapter", "Upgrading from version " + oldVersion
                + " to " + newVersion
                + ", which will destroy all old data");
        db.execSQL("drop table if exists " + Constants.TABLE_NAME);
        onCreate(db);
    }
}
