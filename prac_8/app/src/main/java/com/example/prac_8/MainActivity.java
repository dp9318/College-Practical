package com.example.prac_8;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result1);
        result.setText("onCreate");
    }
    @Override
    protected void onStop(){
        super.onStop();
        String res = result.getText().toString();
        result.setText(res + "\n" + "onStart");
    }
    @Override
    protected void onStart(){
        super.onStart();
        String res = result.getText().toString();
        result.setText(res + "\n" + "onStart");
    }
    @Override
    protected void onPause(){
        super.onPause();
        String res = result.getText().toString();
        result.setText(res + "\n" + "onPause");
    }
    @Override
    protected void onResume(){
        super.onResume();
        String res = result.getText().toString();
        result.setText(res + "\n" + "onResume");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        String res = result.getText().toString();
        result.setText(res + "\n" + "onDestroy");
    }
}
