package folderit.net.ejemplos.clase3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import folderit.net.ejemplos.R;

public class StartForResultActivity extends AppCompatActivity {

    private Button mButton = null;
    private EditText mEditText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_for_result);

        mButton = (Button) findViewById(R.id.button_for_result);
        mEditText = (EditText) findViewById(R.id.editText_for_result);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mString = mEditText.getText().toString().trim();

                Intent returnIntent = new Intent();
                returnIntent.putExtra("result", mString);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }
        });

    }
}
