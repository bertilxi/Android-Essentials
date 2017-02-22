package folderit.net.ejemplos.clase2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import folderit.net.ejemplos.R;

public class Clase2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase2);
        Button buttonDatePicker = (Button) findViewById(R.id.button_datepicker);
        Button buttonTimePicker = (Button) findViewById(R.id.button_timepicker);
        Button buttonListView = (Button) findViewById(R.id.listview_button);
        Button buttonToast = (Button) findViewById(R.id.button_toast);
        Button buttonDialog = (Button) findViewById(R.id.button_dialog);
        Button buttonSnackBar = (Button) findViewById(R.id.button_snackbar);


        buttonDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DatepickerActivity.class);
                startActivity(i);
            }
        });

        buttonTimePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), TimepickerActivity.class);
                startActivity(i);
            }
        });

        buttonListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), SimpleListActivity.class);
                startActivity(i);
            }
        });

        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(v.getContext(), "Soy un Toast", Toast.LENGTH_LONG).show();

            }
        });

        buttonDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 1. Instantiate an AlertDialog.Builder with its constructor
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());

                // 2. Chain together various setter methods to set the dialog characteristics
                builder.setMessage("Soy un cuadro de dialogo?")
                        .setTitle("Hola Mundo")
                        .setPositiveButton("SI", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // hagan algo
                            }
                        })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // hagan algo
                            }
                        });

                // 3. Get the AlertDialog from create()
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

        buttonSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar.make(v, "soy un Snack bar", Snackbar.LENGTH_LONG)
                        .setAction("Soy una Acción", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // hagan algo
                            }
                        })
                        .show();

            }
        });

    }
}
