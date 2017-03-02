package folderit.net.ejemplos.clase6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import folderit.net.ejemplos.R;

public class Clase6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase6);

        Button buttonSqlite = (Button) findViewById(R.id.button_sqlite);

        buttonSqlite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), SQLiteActivity.class);
                startActivity(i);
            }
        });

    }
}
