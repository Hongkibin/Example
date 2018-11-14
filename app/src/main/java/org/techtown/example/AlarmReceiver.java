package org.techtown.example;
import android.app.*;
import android.content.*;
import android.graphics.*;
import android.net.*;
import android.os.*;
import android.provider.MediaStore.*;
import android.util.*;
import android.widget.*;
import android.support.v4.app.NotificationCompat;


public class AlarmReceiver extends BroadcastReceiver {

    //private int Example_NOTIFICATION_ID;

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"유통기한을 확인하세요!", Toast.LENGTH_SHORT).show();

        showNotification(context, R.drawable.icon,
                "유통기한 확인", "유통기한을 확인하세요");
    }

    private void showNotification(Context context, int statusBarIconID,
                                  String statusBarTextID, String detailedTextID) {
        Intent contentIntent = new Intent(context, Alarm.class);
     /*   PendingIntent theappIntent =
                PendingIntent.getActivity(context, 0, contentIntent, PendingIntent.FLAG_UPDATE_CURRENT);
*/


        Notification notif = new Notification(statusBarIconID, "유통기한을 확인하세요!!", System.currentTimeMillis());
        notif.sound = Uri.withAppendedPath(Audio.Media.INTERNAL_CONTENT_URI, "2");//ringURI;
        notif.flags = Notification.FLAG_INSISTENT;
        //notif.setLatestEventInfo(context, from, message, theappIntent);
        notif.ledARGB = Color.YELLOW;
        NotificationManager nm = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);

        nm.notify(1234, notif);

    }
}