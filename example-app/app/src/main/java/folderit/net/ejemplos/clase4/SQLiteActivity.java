package folderit.net.ejemplos.clase4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import folderit.net.ejemplos.R;

public class SQLiteActivity extends AppCompatActivity {

    MyDB mDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);

        mDB = new MyDB(this);
        mDB.open();
    }


    public void saveItToDB() {
        mDB.insertProducto("", Double.valueOf(""));
        mDB.close();
        // seguir procesando logica
    }
}
