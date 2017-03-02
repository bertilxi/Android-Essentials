package folderit.net.ejemplos.clase3;

import android.content.Intent;
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

        Button buttonCustomListView = (Button) findViewById(R.id.button_custom_listview);
        Button buttonRecyclerView = (Button) findViewById(R.id.button_recyclerview);

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

    }

}
