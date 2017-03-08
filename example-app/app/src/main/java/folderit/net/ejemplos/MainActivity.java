package folderit.net.ejemplos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import folderit.net.ejemplos.clase2.Clase2Activity;
import folderit.net.ejemplos.clase3.Clase3Activity;
import folderit.net.ejemplos.clase4.Clase4Activity;
import folderit.net.ejemplos.clase5.Clase5Activity;
import folderit.net.ejemplos.clase6.Clase6Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_clase2 = (Button) findViewById(R.id.button_clase2);
        Button button_clase3 = (Button) findViewById(R.id.button_clase3);
        Button button_clase4 = (Button) findViewById(R.id.button_clase4);
        Button button_clase5 = (Button) findViewById(R.id.button_clase5);
        Button button_clase6 = (Button) findViewById(R.id.button_clase6);

        button_clase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Clase2Activity.class);
                startActivity(i);
            }
        });

        button_clase3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Clase3Activity.class);
                startActivity(i);
            }
        });

        button_clase4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Clase4Activity.class);
                startActivity(i);
            }
        });

        button_clase5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Clase5Activity.class);
                startActivity(i);
            }
        });

        button_clase6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Clase6Activity.class);
                startActivity(i);
            }
        });


        //
        // Respuesta para Martin sobre agregar views programaticamente
        //

        LinearLayout myLayout = (LinearLayout) findViewById(R.id.activity_main);

        Button mButton = new Button(this);

        mButton.setText("Me agregaron a mano");

        mButton.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));

        myLayout.addView(mButton);


    }

}
