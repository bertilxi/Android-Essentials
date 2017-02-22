package folderit.net.ejemplos.clase6;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;

public class MyContentProvider extends ContentProvider {

    private static final int ALL_COUNTRIES = 1;
    private static final int SINGLE_COUNTRY = 2;
    private static final String AUTHORITY = "com.folderit.net.MyProvider";
    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/countries");
    private static final UriMatcher uriMatcher;

    // uris of the content provider
    static {
        uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        uriMatcher.addURI(AUTHORITY, "countries", ALL_COUNTRIES);
        uriMatcher.addURI(AUTHORITY, "countries/#", SINGLE_COUNTRY);
    }

    private SQLiteDbHelper dbHelper;

    @Override
    public boolean onCreate() {
        // get access to the database helper
        dbHelper = new SQLiteDbHelper(getContext());
        return false;
    }

    @Override
    public String getType(Uri uri) {

        switch (uriMatcher.match(uri)) {
            case ALL_COUNTRIES:
                return "vnd.android.cursor.dir/" + AUTHORITY + "/countries";
            case SINGLE_COUNTRY:
                return "vnd.android.cursor.item/" + AUTHORITY + "/countries/#";
            default:
                throw new IllegalArgumentException("Unsupported URI: " + uri);
        }
    }

    @Override
    public Uri insert(@NonNull Uri uri, ContentValues values) {

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        switch (uriMatcher.match(uri)) {
            case ALL_COUNTRIES:
                //do nothing
                break;
            default:
                throw new IllegalArgumentException("Unsupported URI: " + uri);
        }
        long id = db.insert(SQLiteDB.SQLITE_TABLE, null, values);
        getContext().getContentResolver().notifyChange(uri, null);
        return Uri.parse(CONTENT_URI + "/" + id);
    }

    @Override
    public Cursor query(@NonNull Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        SQLiteQueryBuilder queryBuilder = new SQLiteQueryBuilder();
        queryBuilder.setTables(SQLiteDB.SQLITE_TABLE);

        switch (uriMatcher.match(uri)) {
            case ALL_COUNTRIES:
                //do nothing
                break;
            case SINGLE_COUNTRY:
                String id = uri.getPathSegments().get(1);
                queryBuilder.appendWhere(SQLiteDB.KEY_ROWID + "=" + id);
                break;
            default:
                throw new IllegalArgumentException("Unsupported URI: " + uri);
        }

        Cursor cursor = queryBuilder.query(db, projection, selection, selectionArgs, null, null, sortOrder);
        return cursor;

    }

    @Override
    public int delete(@NonNull Uri uri, String selection, String[] selectionArgs) {

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        switch (uriMatcher.match(uri)) {
            case ALL_COUNTRIES:
                //do nothing
                break;
            case SINGLE_COUNTRY:
                String id = uri.getPathSegments().get(1);
                selection = SQLiteDB.KEY_ROWID + "=" + id
                        + (!TextUtils.isEmpty(selection) ? " AND (" + selection + ')' : "");
                break;
            default:
                throw new IllegalArgumentException("Unsupported URI: " + uri);
        }
        int deleteCount = db.delete(SQLiteDB.SQLITE_TABLE, selection, selectionArgs);
        getContext().getContentResolver().notifyChange(uri, null);
        return deleteCount;
    }

    @Override
    public int update(@NonNull Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        switch (uriMatcher.match(uri)) {
            case ALL_COUNTRIES:
                //do nothing
                break;
            case SINGLE_COUNTRY:
                String id = uri.getPathSegments().get(1);
                selection = SQLiteDB.KEY_ROWID + "=" + id
                        + (!TextUtils.isEmpty(selection) ?
                        " AND (" + selection + ')' : "");
                break;
            default:
                throw new IllegalArgumentException("Unsupported URI: " + uri);
        }
        int updateCount = db.update(SQLiteDB.SQLITE_TABLE, values, selection, selectionArgs);
        getContext().getContentResolver().notifyChange(uri, null);
        return updateCount;
    }

}