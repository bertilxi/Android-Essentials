package folderit.net.ejemplos.clase6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

public class SQLiteDB {

    public static final String KEY_ROWID = "_id";
    public static final String KEY_CODE = "code";
    public static final String KEY_NAME = "name";
    public static final String KEY_CONTINENT = "continent";
    public static final String SQLITE_TABLE = "Country";
    private static final String LOG_TAG = "CountriesDb";

    private StringBuilder createBuilder = new StringBuilder()
            .append("CREATE TABLE if not exists ")
            .append(SQLITE_TABLE).append(" (")
            .append(KEY_ROWID).append(" integer PRIMARY KEY autoincrement,")
            .append(KEY_CODE).append(",")
            .append(KEY_NAME).append(",")
            .append(KEY_CONTINENT).append(",")
            .append(" UNIQUE (").append(KEY_CODE).append("));");

    private String DATABASE_CREATE = createBuilder.toString();
    private Context context;
    private SQLiteDatabase db;
    private SQLiteDbHelper dbHelper;


    public SQLiteDB(Context c) {
        context = c;
        dbHelper = new SQLiteDbHelper(context);
    }


    public void onCreate(SQLiteDatabase db) {
        Log.w(LOG_TAG, DATABASE_CREATE);
        db.execSQL(DATABASE_CREATE);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(LOG_TAG, "Upgrading database from version " + oldVersion + " to "
                + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + SQLITE_TABLE);
        onCreate(db);
    }

    public void close() {
        db.close();
    }

    public void open() throws SQLiteException {
        try {
            db = dbHelper.getWritableDatabase();
        } catch (SQLiteException ex) {
            db = dbHelper.getReadableDatabase();
        }
    }


}

