package folderit.net.ejemplos.clase1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import folderit.net.ejemplos.R;

public class Clase1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase1);

        Button mButton = (Button) findViewById(R.id.my_button);
        final EditText mEditText = (EditText) findViewById(R.id.editText);
        final TextView mTextView = (TextView) findViewById(R.id.my_textView);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mString = "Hola " + mEditText.getText();
                mTextView.setText(mString);
                Toast.makeText(Clase1Activity.this, mString, Toast.LENGTH_LONG).show();
            }
        });
    }
}
