package folderit.net.ejemplos.clase4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import folderit.net.ejemplos.R;

public class AnrActivity extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anr1);

        final TextView mTextView = (TextView) findViewById(R.id.textView_anr);
        Button mButton = (Button) findViewById(R.id.button_exec_anr);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // con un hilo
                // new MyThread().start();

                // sin hilos
                int i = 0;
                while (true) {
                    try {
                        mTextView.setText("Hola me voy " + i++);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }


            }
        });

    }

    // asi evitariamos el ANR, pero no cumplimos con no tocar el UI Thread desde otros hilos

    class MyThread extends Thread {

        @Override
        public void run() {
            int i = 0;
            while (true) {
                try {
                    mTextView.setText("Hola me voy " + i++);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }


}
