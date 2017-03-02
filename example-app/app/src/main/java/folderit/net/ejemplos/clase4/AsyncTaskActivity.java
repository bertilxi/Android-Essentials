package folderit.net.ejemplos.clase4;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import folderit.net.ejemplos.R;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class AsyncTaskActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);

        textView = (TextView) findViewById(R.id.TextView01);
        button = (Button) findViewById(R.id.readWebpage);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DownloadWebPageTask task = new DownloadWebPageTask();
                task.execute(new String[]{"http://folderit.net/"});
            }
        });
    }

    private class DownloadWebPageTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... urls) {

            // we use the OkHttp library from https://github.com/square/okhttp

            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url(urls[0]).build();

            Response response = null;

            try {
                response = client.newCall(request).execute();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (response.isSuccessful()) {
                try {
                    return response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return "Download failed";

        }

        @Override
        protected void onPostExecute(String result) {
            textView.setText(result);
        }

    }

}
