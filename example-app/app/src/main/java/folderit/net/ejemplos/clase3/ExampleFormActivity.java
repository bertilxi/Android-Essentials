package folderit.net.ejemplos.clase3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import folderit.net.ejemplos.R;


public class ExampleFormActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextPassword;
    private EditText editTextEmail;
    private EditText editTextPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_form);

        editTextName = (EditText) findViewById(R.id.editText_name);
        editTextPassword = (EditText) findViewById(R.id.editText_password);
        editTextEmail = (EditText) findViewById(R.id.editText_email);
        editTextPhone = (EditText) findViewById(R.id.editText_tel);

    }


/*

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String name = (String) savedInstanceState.get("name");
        String pass = (String) savedInstanceState.get("pass");
        String email = (String) savedInstanceState.get("email");
        String tel = (String) savedInstanceState.get("tel");

        editTextName.setText(name);
        editTextPassword.setText(pass);
        editTextEmail.setText(email);
        editTextPhone.setText(tel);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("name", editTextName.getText().toString());
        outState.putString("pass", editTextPassword.getText().toString());
        outState.putString("email", editTextEmail.getText().toString());
        outState.putString("tel", editTextPhone.getText().toString());
    }
*/



}
