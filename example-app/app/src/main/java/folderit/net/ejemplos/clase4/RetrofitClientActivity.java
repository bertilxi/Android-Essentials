package folderit.net.ejemplos.clase4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import folderit.net.ejemplos.R;
import folderit.net.ejemplos.clase4.domain.GithubRepo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class RetrofitClientActivity extends AppCompatActivity {

    private ListView mListView;
    private List<GithubRepo> repos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_client);

        mListView = (ListView) findViewById(R.id.retrofit_listview);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);

        service.listRepos("bertilxi").enqueue(new Callback<List<GithubRepo>>() {
            @Override
            public void onResponse(Call<List<GithubRepo>> call, Response<List<GithubRepo>> response) {
                repos = response.body();
                List<String> mList = new ArrayList<String>();

                for (GithubRepo r : repos) {
                    mList.add(r.getName());
                }

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(RetrofitClientActivity.this,
                        android.R.layout.simple_list_item_1, mList);

                mListView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<GithubRepo>> call, Throwable t) {

            }
        });

    }

    public interface GitHubService {
        @GET("users/{user}/repos")
        Call<List<GithubRepo>> listRepos(@Path("user") String user);
    }

}
