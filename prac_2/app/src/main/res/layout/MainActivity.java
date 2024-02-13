package com.example.prac_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(score);
    }
    public void encriment(View view){
        int i= this.score + 1;
        this.score=i;
        display(i);
    }
    public void decrement(View view){
        if(score>0){
            int i=this.score-1;
            this.score=i;
            display(i);
        }
    }
    public void reset(View view){
        score=0;
        display(score);
    }
    public void display(int number){
        TextView scoreDisplay = (TextView) findViewById(R.id.scoreView);
        scoreDisplay.setText(String.valueOf(number));
    }
}