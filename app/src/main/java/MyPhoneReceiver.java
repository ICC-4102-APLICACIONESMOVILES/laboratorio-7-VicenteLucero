import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.gamma.lab07.MainActivity;

public class MyPhoneReceiver extends BroadcastReceiver {


    public void onReceive(Context context, Intent arg1)
    {
        Intent intent = new Intent(context,MainActivity.class);
        context.startActivity(intent);
        Log.i("Autostart", "started");

    }
}
