import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.example.gamma.lab07.MainActivity;
import com.example.gamma.lab07.R;

import static android.content.Context.ALARM_SERVICE;


public class AlarmReceiver extends BroadcastReceiver {
    int id = 1;
    @Override
    public void onReceive(Context context, Intent intent) {

        AlarmManager alarmManager=(AlarmManager) context.getSystemService();
        Intent intent = new Intent(this, AlarmReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
        alarmManager.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,System.currentTimeMillis(),2000, pendingIntent);

    }

    int id = 1;
    private void generateNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"channelID")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("alarma")
                .setContentText("la alarma esta sonando..");

        NotificationManager notificationManager=(NotificationManager) context.getSystemService();
        notificationManager.notify(id,builder.build());
        id++;
    }

    private void updateNotification(){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"channelID")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("alarma")
                .setContentText("la alarma esta sonando..");
        NotificationManager notificationManager=(NotificationManager) context.getSystemService();
        notificationManager.notify(id,builder.build());
        id++;
    }
}
