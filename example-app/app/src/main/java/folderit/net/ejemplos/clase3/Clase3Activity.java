package folderit.net.ejemplos.clase3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import folderit.net.ejemplos.R;

public class Clase3Activity extends AppCompatActivity {

    BoundService mService;
    boolean mBound = false;
    private PendingIntent pendingIntent;

    /**
     * Defines callbacks for service binding, passed to bindService()
     */
    private final ServiceConnection mConnection = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName className,
                                       IBinder service) {
            // We've bound to LocalService, cast the IBinder and get LocalService instance
            BoundService.MyBinder binder = (BoundService.MyBinder) service;
            mService = binder.getService();
            mBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName arg0) {
            mBound = false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase3);


        Button buttonANR1 = (Button) findViewById(R.id.button_anr1);
        Button buttonHandler = (Button) findViewById(R.id.button_handler);
        Button buttonAsyncTask = (Button) findViewById(R.id.button_asynctask);
        Button buttonStartedService = (Button) findViewById(R.id.button_started_service);
        Button buttonBoundService = (Button) findViewById(R.id.button_bound_service);
        Button buttonAlarm = (Button) findViewById(R.id.button_alarm);

        buttonANR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), AnrActivity.class);
                startActivity(i);
            }
        });

        buttonHandler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), HandlerActivity.class);
                startActivity(i);
            }
        });

        buttonAsyncTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), AsyncTaskActivity.class);
                startActivity(i);
            }
        });

        buttonStartedService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), StartedService.class);
                startService(i);
            }
        });

        buttonBoundService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call a method from the LocalService.
                // However, if this call were something that might hang, then this request should
                // occur in a separate thread to avoid slowing down the activity performance.
                int num = mService.getRandomNumber();
                Toast.makeText(v.getContext(), "number: " + num, Toast.LENGTH_SHORT).show();
            }
        });

        buttonAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAlarm();
            }
        });


        int MY_PENDING_INTENT_REQUEST_CODE = 123;
        Intent alarmIntent = new Intent(this, AlarmReceiver.class);
        pendingIntent = PendingIntent
                .getBroadcast(this,MY_PENDING_INTENT_REQUEST_CODE, alarmIntent, 0);

    }

    @Override
    protected void onStart() {
        super.onStart();
        // Bind to BoundService
        Intent intent = new Intent(Clase3Activity.this, BoundService.class);
        bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Unbind from the service
        if (mBound) {
            unbindService(mConnection);
            mBound = false;
        }
    }

    public void setAlarm() {
        AlarmManager manager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        int interval = 8000;

        // podemos usar AlarmManager.RTC en el caso de que solo queramos
        // lanzar la notificacion cuando el dispositivo despierte
        // para este caso AlarmManager.RTC_WAKEUP
        manager.setInexactRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(),
                interval, pendingIntent);

        Toast.makeText(this, "Alarm Set", Toast.LENGTH_SHORT).show();
    }


}
