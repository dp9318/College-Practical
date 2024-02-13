package com.example.prac_14;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonStart, buttonStop,buttonNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);
        buttonNext =  findViewById(R.id.buttonNext);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
        buttonNext.setOnClickListener(this);

    }
    public void onClick(View src) {
        if (src.getId() == R.id.buttonStart) {
            startService(new Intent(this, MyService.class));
        }
        else if (src.getId() == R.id.buttonStop) {
            stopService(new Intent(this, MyService.class));
        } else if (src.getId() == R.id.buttonNext) {
            Intent intent=new Intent(this,NextPage.class);
            startActivity(intent);
        }
    }
}