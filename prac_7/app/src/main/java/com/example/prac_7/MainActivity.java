package com.example.prac_7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1, button2 , button3;
        final RelativeLayout relativeLayout;
        button1 = findViewById(R.id.btVar1);
        button2 = findViewById(R.id.btVar2);
        button3 = findViewById(R.id.btVar3);
        relativeLayout = findViewById(R.id.rlVar1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout.setBackgroundResource(R.color.blue);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout.setBackgroundResource(R.color.yellow);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                relativeLayout.setBackgroundResource(R.color.red);
            }
        });
    }
}