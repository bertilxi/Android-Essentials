package folderit.net.ejemplos.clase2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import folderit.net.ejemplos.R;

public class SimpleListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<String> colores = new ArrayList<>(); // Adaptado
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");
        colores.add("Naranja");

        //
        // Spinner
        //

        Spinner spinner = (Spinner) findViewById(R.id.spinner); // Cliente

        ArrayAdapter<String> adapter = // adaptador
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, colores);

        spinner.setAdapter(adapter); // la interfaz objetivo esta definida en la clase padre

        //
        // ListView
        //

        final ListView mListView = (ListView) findViewById(R.id.my_list);

        ArrayAdapter<String> mAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, colores);

        mListView.setAdapter(mAdapter);


        mListView.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);


        // Evento de click de un solo item

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemValue = (String) mListView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), itemValue + " " + position, Toast.LENGTH_LONG).show();
            }
        });

        // Evento de click mantenido sobre un item

        mListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                return false;
            }
        });

        //
        // ListView de Seleccion multiple
        //

        mListView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);

        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, colores);

        Button mButton = new Button(this);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int count = mListView.getCount();

                SparseBooleanArray viewItems = mListView.getCheckedItemPositions();

                for (int i = 0; i < count; i++) {

                    if (viewItems.get(i)) {
                        String selectedColor = (String) mListView.getItemAtPosition(i);
                        Log.v("Seleccionado", selectedColor + " en posicion " + i);
                    }

                }

            }
        });

        //
        // GridView
        //

        GridView mGridView = (GridView) findViewById(R.id.my_grid);

        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, colores);

        mGridView.setAdapter(mAdapter);

    }


}
