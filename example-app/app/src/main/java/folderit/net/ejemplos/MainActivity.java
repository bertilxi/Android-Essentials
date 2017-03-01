package folderit.net.ejemplos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import folderit.net.ejemplos.clase2.Clase2Activity;
import folderit.net.ejemplos.clase3.Clase3Activity;
import folderit.net.ejemplos.clase4.Clase4Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_clase2 = (Button) findViewById(R.id.button_clase2);
        Button button_clase3 = (Button) findViewById(R.id.button_clase3);
        Button button_clase4 = (Button) findViewById(R.id.button_clase4);

        button_clase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Clase2Activity.class);
                startActivity(i);
            }
        });

        button_clase3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Clase3Activity.class);
                startActivity(i);
            }
        });

        button_clase4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Clase4Activity.class);
                startActivity(i);
            }
        });


    }

}
