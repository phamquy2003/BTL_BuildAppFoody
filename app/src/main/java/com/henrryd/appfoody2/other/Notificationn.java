package com.henrryd.appfoody2.other;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import androidx.core.app.NotificationCompat;

import com.henrryd.appfoody2.other.MyApplication;
import com.henrryd.appfoody2.R;

import java.util.Date;

public class Notificationn {
    @SuppressLint("NotificationPermission")
    public static void sendnotification(Context context, Intent intent) {
        final int NOIFIFICATION_ID = (int) new Date().getTime();
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.thantai);
        android.app.Notification notification = new NotificationCompat.Builder(context, MyApplication.CHANNEL_ID)
                .setContentTitle("Thông báo ")
                .setContentText(intent.getExtras().getString("ContentText"))
                .setSmallIcon(R.drawable.ic_logo_f2)
                .setLargeIcon(bitmap)
                .build();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(NOIFIFICATION_ID, notification);
    }
}
