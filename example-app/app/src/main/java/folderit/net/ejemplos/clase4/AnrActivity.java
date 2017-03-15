package folderit.net.ejemplos.clase4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import folderit.net.ejemplos.R;

public class AnrActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button mButton;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anr1);

        mTextView = (TextView) findViewById(R.id.textView_anr);
        mButton = (Button) findViewById(R.id.button_exec_anr);

        final boolean conHilos = false;

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (conHilos) {
                    // con un hilo

                    Runnable runnable = new Runnable() {
                        @Override
                        public void run() {

                            while (true) {
                                mTextView.setText("Hola me voy " + i++);
                            }

/*                            for (; i < 10000; i++) {
                                mTextView.post(new Runnable() {
                                    @Override
                                    public void run() {
                                        mTextView.setText("Hola me voy " + i++);
                                    }
                                });
                            }*/

                        }
                    };

                    // asi evitariamos el ANR, pero no cumplimos con
                    // no tocar el UI Thread desde otros hilos
                    new Thread(runnable).start();

                } else {
                    // sin hilos
                    i = 0;
                    while (true) {
                        mTextView.setText("Hola me voy " + i++);
                    }
                }

            }
        });

    }
}
