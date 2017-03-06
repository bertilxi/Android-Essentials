package folderit.net.ejemplos.clase3;

import android.content.Intent;
import android.net.Uri;
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

        Button buttonInefficientList = (Button) findViewById(R.id.button_inefficient_listview);
        Button buttonCustomListView = (Button) findViewById(R.id.button_custom_listview);
        Button buttonRecyclerView = (Button) findViewById(R.id.button_recyclerview);
        Button buttonIntent1 = (Button) findViewById(R.id.button_intent1);
        Button buttonIntent2 = (Button) findViewById(R.id.button_intent2);
        Button buttonSaveInstance = (Button) findViewById(R.id.button_save_instance);

        buttonInefficientList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), InefficientListActivity.class);
                startActivity(i);
            }
        });

        buttonCustomListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), CustomListActivity.class);
                startActivity(i);
            }
        });

        buttonRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), RecyclerListActivity.class);
                startActivity(i);
            }
        });

        buttonIntent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });

        buttonIntent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:928-76-34-26"));
                startActivity(intent);
            }
        });

        buttonSaveInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), ExampleFormActivity.class);
                startActivity(i);
            }
        });

    }

}
