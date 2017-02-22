package folderit.net.ejemplos.clase4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.IOException;
import java.util.List;

import folderit.net.ejemplos.R;
import folderit.net.ejemplos.clase4.domain.GithubRepo;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class RetrofitClientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_client);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);

        Call<List<GithubRepo>> response = service.listRepos("bertilxi");

        try {
            List<GithubRepo> repos = response.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public interface GitHubService {
        @GET("users/{user}/repos")
        Call<List<GithubRepo>> listRepos(@Path("user") String user);
    }

}
