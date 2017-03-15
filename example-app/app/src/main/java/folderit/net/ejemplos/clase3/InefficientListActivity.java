package folderit.net.ejemplos.clase3;

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
import folderit.net.ejemplos.clase3.domain.App;

public class InefficientListActivity extends AppCompatActivity {

    List<App> apps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inefficient_list);

        initData();

        // custom adapter
        AppAdapter adapter = new AppAdapter(apps);

        ListView mListView = (ListView) findViewById(R.id.inneficient_listview);
        mListView.setAdapter(adapter);

    }

    private void initData() {
        apps = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            apps.add(new App().setName("Chrome").setVersion("51." + i).setRating(4.5f).setDescription("Navegador").setDeveloper("Google"));
            apps.add(new App().setName("Firefox").setVersion("45." + i).setRating(4.3f).setDescription("Navegador").setDeveloper("Mozilla"));
            apps.add(new App().setName("Edge").setVersion("12." + i).setRating(2.5f).setDescription("Navegador").setDeveloper("Microsoft"));
            apps.add(new App().setName("Opera").setVersion("41.9." + i).setRating(3).setDescription("Navegador").setDeveloper("Opera"));
            apps.add(new App().setName("Safari").setVersion("11." + i).setRating(3.2f).setDescription("Navegador").setDeveloper("Apple"));
        }

    }

    public class AppAdapter extends ArrayAdapter<App> {

        final LayoutInflater inflater;

        public AppAdapter(List<App> apps) {

            // aqui va nuestro custom layout
            super(InefficientListActivity.this, R.layout.activity_custom_list, apps);

            // proceso de inflado del layout
            inflater = LayoutInflater.from(getContext());

        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {


            View row = inflater.inflate(R.layout.my_list_row, parent, false);

            TextView textViewAppName = null;
            TextView textViewVersion = null;
            TextView textViewDeveloper = null;
            TextView textViewDescription = null;
            RatingBar ratingBar = null;

            textViewAppName = (TextView) row.findViewById(R.id.textView_appname);
            textViewVersion = (TextView) row.findViewById(R.id.textView_version);
            textViewDeveloper = (TextView) row.findViewById(R.id.textView_developer);
            textViewDescription = (TextView) row.findViewById(R.id.textView_description);
            ratingBar = (RatingBar) row.findViewById(R.id.app_ratingBar);

            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    Integer myPosition = (Integer) ratingBar.getTag();
                    getItem(myPosition).setRating(rating);
                }
            });

            ratingBar.setTag(position);
            ratingBar.setRating(this.getItem(position).getRating());
            textViewAppName.setText(this.getItem(position).getName());
            textViewVersion.setText(this.getItem(position).getVersion());
            textViewDeveloper.setText(this.getItem(position).getDeveloper());
            textViewDescription.setText(this.getItem(position).getDescription());


            return row;
        }


    }

}
