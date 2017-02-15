package folderit.net.ejemplos.clase3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import folderit.net.ejemplos.R;

public class Clase3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase3);


        Button buttonANR1 = (Button) findViewById(R.id.button_anr1);
        Button buttonHandler = (Button) findViewById(R.id.button_handler);
        Button buttonAsyncTask = (Button) findViewById(R.id.button_asynctask);

        buttonANR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Clase3Activity.this, AnrActivity.class);
                startActivity(i);
            }
        });

        buttonHandler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Clase3Activity.this, HandlerActivity.class);
                startActivity(i);
            }
        });

        buttonAsyncTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Clase3Activity.this, AsyncTaskActivity.class);
                startActivity(i);
            }
        });


    }
}
