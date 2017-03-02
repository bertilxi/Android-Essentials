package folderit.net.ejemplos.clase4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import folderit.net.ejemplos.R;

public class HttpUrlConnectionClientActivity extends AppCompatActivity {

    private TextView mTextView;
    private String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http_url_connection_client);

        mTextView = (TextView) findViewById(R.id.textView_httpurlcon);

        // No podemos acceder a la red desde la UI !!!
        // por lo tanto debemos crear un hilo

        Runnable mRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    // esto solo nos devuelve un string !
                    // debemos parsear el string con Jackson o Gson para convertirlo en un POJO
                    result = listRepos("bertilxi");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                mTextView.post(new Runnable() {
                    @Override
                    public void run() {
                        mTextView.setText(result);
                    }
                });
            }
        };

        new Thread(mRunnable).start();

    }

    public String listRepos(String user) throws Exception {

        final String url = "https://api.github.com/users/" + user + "/repos";

        StringBuilder result = new StringBuilder();
        URL mUrl = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) mUrl.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            result.append(line);
        }

        bufferedReader.close();
        return result.toString();
    }

}
