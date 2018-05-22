package com.example.gamma.lab07;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getBaseContext(),"Hello........",Toast.LENGTH_LONG).show();
    }

    private void generateNotification(){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"channelID")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("alarma")
                .setContentText("la alarma esta sonando..");

        NotificationManager notificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFICACION_ID,builder.build());
    }

    private void updateNotification(){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"channelID")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("alarma")
                .setContentText("la alarma esta sonando..");
    }
}
