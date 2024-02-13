package com.example.prac_13;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnShowNotification = findViewById(R.id.btn_show_notification);
        int notificationId = 1;
        btnShowNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Create a notification channel if the SDK version is AndroidOreo or higher
                NotificationChannel channel = new
                        NotificationChannel("channel_id", "Channel Name",
                        NotificationManager.IMPORTANCE_HIGH);
                NotificationManager manager =
                        getSystemService(NotificationManager.class);
                manager.createNotificationChannel(channel);
                NotificationCompat.Builder builder = new
                        NotificationCompat.Builder(MainActivity.this, "channel_id")
                        .setSmallIcon(R.drawable.ic_launcher_foreground)
                        .setContentTitle("Notification Title")
                        .setContentText("Notification Text")
                        .setPriority(NotificationCompat.PRIORITY_HIGH);
                NotificationManagerCompat managerCompat =
                        NotificationManagerCompat.from(MainActivity.this);
                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                        android.Manifest.permission.POST_NOTIFICATIONS) !=
                        PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(MainActivity.this,"Notification permission not granted!", Toast.LENGTH_SHORT).show();
                    return;
                }
                managerCompat.notify(notificationId, builder.build());
            }
        });
    }
}
