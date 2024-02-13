package com.example.prac_12;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class RecievingActivity extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent){
        Toast.makeText(context, "Intent Detected", Toast.LENGTH_SHORT).show();
    }
}