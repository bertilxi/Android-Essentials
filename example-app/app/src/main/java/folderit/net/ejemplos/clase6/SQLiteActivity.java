package folderit.net.ejemplos.clase6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import folderit.net.ejemplos.R;

public class SQLiteActivity extends AppCompatActivity {

    SQLiteDB mDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);

        mDB = new SQLiteDB(this);
        mDB.open();
    }

    public void saveItToDB() {
        // hacer algo
        mDB.close();
        // seguir procesando logica
    }
}
