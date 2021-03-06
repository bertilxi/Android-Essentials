package folderit.net.ejemplos.clase4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import folderit.net.ejemplos.R;

public class HandlerActivity extends AppCompatActivity {

    private ProgressBar mProgress;
    private TextView mText;
    private Button mButton;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);

        mProgress = (ProgressBar) findViewById(R.id.progressBar1);
        mText = (TextView) findViewById(R.id.textView1);
        mButton = (Button) findViewById(R.id.button_handler);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startProgress();
            }
        });

    }

    private void startProgress() {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                for (; i <= 10; i++) {

                    hacemosAlgo();

                    mProgress.post(new Runnable() {

                        @Override
                        public void run() {
                            mProgress.setProgress(i);
                        }

                    });

                    mText.post(new Runnable() {
                        @Override
                        public void run() {
                            mText.setText("Updating " + i);
                        }
                    });
                }

            }
        };

        new Thread(runnable).start();
    }

    // Simulamos que hacemos algo que lleva tiempo
    private void hacemosAlgo() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
