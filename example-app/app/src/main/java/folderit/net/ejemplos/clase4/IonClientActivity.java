package folderit.net.ejemplos.clase4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.reflect.TypeToken;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.koushikdutta.ion.future.ResponseFuture;

import java.util.ArrayList;
import java.util.List;

import folderit.net.ejemplos.R;
import folderit.net.ejemplos.clase4.domain.GithubRepo;

public class IonClientActivity extends AppCompatActivity {

    private List<GithubRepo> repos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ion_client);

        listRepos("bertilxi").setCallback(new FutureCallback<List<GithubRepo>>() {
            @Override
            public void onCompleted(Exception e, List<GithubRepo> result) {

                if(e != null){
                    e.printStackTrace();
                    return;
                }

                repos = result;

            }
        });

    }

    public ResponseFuture<List<GithubRepo>> listRepos(String user) {
        return Ion.with(IonClientActivity.this)
                .load("https://api.github.com/users/" + user + "/repos")
                .as(new TypeToken<List<GithubRepo>>() {});
    }

}
