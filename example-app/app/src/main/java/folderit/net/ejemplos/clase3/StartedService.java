package folderit.net.ejemplos.clase3;

import android.app.IntentService;
import android.content.Intent;

public class StartedService extends IntentService {

    public StartedService() {
        super("StartedService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }





}