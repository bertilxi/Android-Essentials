package folderit.net.ejemplos.clase5;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import folderit.net.ejemplos.R;

public class PermisosActivity extends AppCompatActivity {

    private static final int PERMISSION_REQUEST_CONTACT = 987;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permisos);
        askForContactPermission();
    }


    public void askForContactPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(PermisosActivity.this,
                    Manifest.permission.READ_CONTACTS)
                    != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(PermisosActivity.this,
                        Manifest.permission.CALL_PHONE)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PermisosActivity.this);
                    builder.setTitle("Leer Contactos!!!");
                    builder.setPositiveButton(android.R.string.ok, null);
                    builder.setMessage("Puedo acceder a tus contactos???");
                    builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @TargetApi(Build.VERSION_CODES.M)
                        @Override
                        public void onDismiss(DialogInterface dialog) {
                            requestPermissions(new String[]{Manifest.permission.READ_CONTACTS}
                                    , PERMISSION_REQUEST_CONTACT);
                        }
                    });
                    builder.show();
                } else {
                    ActivityCompat.requestPermissions(PermisosActivity.this,
                            new String[]{Manifest.permission.READ_CONTACTS}, PERMISSION_REQUEST_CONTACT);
                }
            } else {

// ya tenia el permiso no lo tuve que pedir
                load();
            }
        } else {
            // la versión alcanza con tenerlo declarado
            load();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case PermisosActivity.PERMISSION_REQUEST_CONTACT: {
                // si el request es cancelado el arreglo es vacio.
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // tengo el permiso!!!.
                    load();
                } else {
                    // no tenemos permisos
                    Toast.makeText(PermisosActivity.this, "No Permiso", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }

    private void load() {

    }


}
