package com.example.prac_10;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private EditText message_to_view;
    private EditText message_subject_view;
    private EditText message_body_view;
    private Button send_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message_to_view = findViewById(R.id.message_to);
        message_subject_view = findViewById(R.id.message_subject);
        message_body_view = findViewById(R.id.message_body);
        send_button = findViewById(R.id.send_button);
        send_button.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_EMAIL, message_to_view.getText().toString().split("[,]",0));
            intent.putExtra(Intent.EXTRA_SUBJECT, message_subject_view.getText().toString());
            intent.putExtra(Intent.EXTRA_TEXT, message_body_view.getText().toString());
            Intent chooser = new Intent(Intent.createChooser(intent, "Send message via..."));
            startActivity(chooser);
        });
    }
}