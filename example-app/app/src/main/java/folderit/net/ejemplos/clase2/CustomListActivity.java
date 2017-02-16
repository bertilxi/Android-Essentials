package folderit.net.ejemplos.clase2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import folderit.net.ejemplos.R;

public class CustomListActivity extends AppCompatActivity {

    List<App> apps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        initData();

        // custom adapter
        AppAdapter adapter = new AppAdapter(apps);

        ListView mListView = (ListView) findViewById(R.id.custom_list);
        mListView.setAdapter(adapter);

    }

    private void initData() {
        apps = new ArrayList<>();
        apps.add(new App().setName("Chrome").setVersion("51").setRating(4.5f).setDescription("Navegador").setDeveloper("Google"));
        apps.add(new App().setName("Firefox").setVersion("45").setRating(4.3f).setDescription("Navegador").setDeveloper("Mozilla"));
        apps.add(new App().setName("Edge").setVersion("12").setRating(2.5f).setDescription("Navegador").setDeveloper("Microsoft"));
        apps.add(new App().setName("Opera").setVersion("41.9").setRating(3).setDescription("Navegador").setDeveloper("Opera"));
        apps.add(new App().setName("Safari").setVersion("11").setRating(3.2f).setDescription("Navegador").setDeveloper("Apple"));
    }


    public class AppAdapter extends ArrayAdapter<App> {

        final LayoutInflater inflater;

        public AppAdapter(List<App> apps) {

            // aqui va nuestro custom layout
            super(CustomListActivity.this, R.layout.activity_custom_list, apps);

            // proceso de inflado del layout
            inflater = LayoutInflater.from(getContext());

        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {



            /*
                Android intentara reciclar la vista.
                haciendo uso del convertView reutilizamos las filas ya creadas.
                si “convertView” es null se crea una instancia y se realiza el proceso de “inflation”,
                sino, si no era null, se la reusa.
             */

            View row = convertView;

            /*
                Aca podriamos sacar el if e inflar la vista siempre que aparezca
                una nueva fila, pero no tiene buena performance
                por esta razon se agrega un if y solo se infla cuando no exista

                row = inflater.inflate(R.layout.my_list_row, parent, false);
            */

            if (row == null) {
                row = inflater.inflate(R.layout.my_list_row, parent, false);
            }

            // aqui usamos el patron holder

            AppHolder holder = (AppHolder) row.getTag();
            RatingBar.OnRatingBarChangeListener listener = null;
            if (holder == null) {
                holder = new AppHolder(row);
                row.setTag(holder);

                holder.ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        Integer myPosition = (Integer) ratingBar.getTag();
                        getItem(myPosition).setRating(rating);
                    }
                });

            }

            // aqui se usa el holder y se llena la informacion de la vista

            holder.ratingBar.setTag(position);
            holder.ratingBar.setRating(this.getItem(position).getRating());

            holder.textViewAppName.setText(this.getItem(position).getName());
            holder.textViewVersion.setText(this.getItem(position).getVersion());
            holder.textViewDeveloper.setText(this.getItem(position).getDeveloper());
            holder.textViewDescription.setText(this.getItem(position).getDescription());


            return row;
        }

        // nuestro ViewHolder

        class AppHolder {

            TextView textViewAppName = null;
            TextView textViewVersion = null;
            TextView textViewDeveloper = null;
            TextView textViewDescription = null;
            RatingBar ratingBar = null;

            AppHolder(View row) {
                textViewAppName = (TextView) row.findViewById(R.id.textView_appname);
                textViewVersion = (TextView) row.findViewById(R.id.textView_version);
                textViewDeveloper = (TextView) row.findViewById(R.id.textView_developer);
                textViewDescription = (TextView) row.findViewById(R.id.textView_description);
                ratingBar = (RatingBar) row.findViewById(R.id.app_ratingBar);
            }
        }

    }
}
