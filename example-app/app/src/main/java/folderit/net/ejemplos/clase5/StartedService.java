package folderit.net.ejemplos.clase5;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

public class StartedService extends IntentService {

    public StartedService() {
        super("StartedService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        try {
            Toast.makeText(this.getApplicationContext(), "soy un started service", Toast.LENGTH_LONG).show();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}