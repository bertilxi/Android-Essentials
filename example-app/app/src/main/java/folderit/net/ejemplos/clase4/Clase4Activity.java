package folderit.net.ejemplos.clase4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import folderit.net.ejemplos.R;

public class Clase4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase4);

        Button buttonANR1 = (Button) findViewById(R.id.button_anr1);
        Button buttonHandler = (Button) findViewById(R.id.button_handler);
        Button buttonAsyncTask = (Button) findViewById(R.id.button_asynctask);
        Button buttonHttpUrlConnection = (Button) findViewById(R.id.button_httpurlconnection);
        Button buttonION = (Button) findViewById(R.id.button_ion);
        Button buttonRetrofit = (Button) findViewById(R.id.button_retrofit);


        buttonANR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), AnrActivity.class);
                startActivity(i);
            }
        });

        buttonHandler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), HandlerActivity.class);
                startActivity(i);
            }
        });

        buttonAsyncTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), AsyncTaskActivity.class);
                startActivity(i);
            }
        });

        buttonHttpUrlConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), HttpUrlConnectionClientActivity.class);
                startActivity(i);
            }
        });

        buttonION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), IonClientActivity.class);
                startActivity(i);
            }
        });

        buttonRetrofit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), RetrofitClientActivity.class);
                startActivity(i);
            }
        });

    }
}
