package folderit.net.ejemplos.clase4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
    private ListView mListVIew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ion_client);

        mListVIew = (ListView) findViewById(R.id.ion_listview);

        listRepos("bertilxi").setCallback(new FutureCallback<List<GithubRepo>>() {
            @Override
            public void onCompleted(Exception e, List<GithubRepo> result) {

                if (e != null) {
                    e.printStackTrace();
                    return;
                }

                repos = result;
                List<String> mList = new ArrayList<String>();

                for (GithubRepo r : repos) {
                    mList.add(r.getName());
                }

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(IonClientActivity.this,
                        android.R.layout.simple_list_item_1, mList);

                mListVIew.setAdapter(adapter);

            }
        });

    }

    public ResponseFuture<List<GithubRepo>> listRepos(String user) {
        String url = "https://api.github.com/users/" + user + "/repos";
        return Ion.with(IonClientActivity.this)
                .load(url)
                .as(new TypeToken<List<GithubRepo>>() {
                });
    }

}
