package folderit.net.ejemplos.clase3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import folderit.net.ejemplos.R;
import folderit.net.ejemplos.clase3.domain.App;

public class RecyclerListActivity extends AppCompatActivity {

    List<App> apps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_list);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.m_recycler_view);

        // Si estás seguro que el tamaño del RecyclerView no se cambiará,
        // puedes añadirlo lo siguiente para mejorar el desempeño
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        initData();

        AppRecyclerAdapter adapter = new AppRecyclerAdapter(apps);
        mRecyclerView.setAdapter(adapter);

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

    class AppRecyclerAdapter extends RecyclerView.Adapter<AppRecyclerAdapter.AppViewHolder> {

        List<App> mApps = new ArrayList<>();

        AppRecyclerAdapter(List<App> appList) {
            this.mApps = appList;
        }

        @Override
        public AppViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_list_row, parent, false);
            return new AppViewHolder(view);
        }

        @Override
        public void onBindViewHolder(AppViewHolder holder, int position) {
            holder.ratingBar.setRating(mApps.get(position).getRating());
            holder.textViewAppName.setText(mApps.get(position).getName());
            holder.textViewDescription.setText(mApps.get(position).getDescription());
            holder.textViewDeveloper.setText(mApps.get(position).getDeveloper());
            holder.textViewVersion.setText(mApps.get(position).getVersion());
        }

        @Override
        public int getItemCount() {
            return mApps.size();
        }

        class AppViewHolder extends RecyclerView.ViewHolder {

            TextView textViewAppName = null;
            TextView textViewVersion = null;
            TextView textViewDeveloper = null;
            TextView textViewDescription = null;
            RatingBar ratingBar = null;

            AppViewHolder(View row) {
                super(row);
                textViewAppName = (TextView) row.findViewById(R.id.textView_appname);
                textViewVersion = (TextView) row.findViewById(R.id.textView_version);
                textViewDeveloper = (TextView) row.findViewById(R.id.textView_developer);
                textViewDescription = (TextView) row.findViewById(R.id.textView_description);
                ratingBar = (RatingBar) row.findViewById(R.id.app_ratingBar);
            }
        }
    }

}
