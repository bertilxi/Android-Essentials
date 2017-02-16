package folderit.net.ejemplos.clase4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class MyDB {
    private final Context context;
    private final MyDbHelper dbhelper;
    private SQLiteDatabase db;

    public MyDB(Context c) {
        context = c;
        dbhelper = new MyDbHelper(context, Constants.DATABASE_NAME, null,
                Constants.DATABASE_VERSION);
    }

    public void close() {
        db.close();
    }

    public void open() throws SQLiteException {
        try {
            db = dbhelper.getWritableDatabase();
        } catch (SQLiteException ex) {
            db = dbhelper.getReadableDatabase();
        }
    }

    public long insertProducto(String nombre, Double precio) {
        try {
            ContentValues newPrd = new ContentValues();
            newPrd.put(Constants.NOMBRE, nombre);
            newPrd.put(Constants.PRECIO, precio);
            newPrd.put(Constants.FECHA_CREACION,
                    java.lang.System.currentTimeMillis());
            return db.insert(Constants.TABLE_NAME, null, newPrd);
        } catch (SQLiteException ex) {
            return -1;
        }
    }

    public Cursor getProductos() {
        Cursor c = db.query(Constants.TABLE_NAME, null, null,
                null, null, null, null);
        return c;
    }



}



