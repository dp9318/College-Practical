package com.example.prac_11;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class LoginActivity extends AppCompatActivity {
    private EditText login_id_view;
    private EditText password_view;
    private Button login_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
        login_id_view = findViewById(R.id.login_id);
        password_view = findViewById(R.id.login_password);
        login_button = findViewById(R.id.login_button);
        Intent intent = new Intent(this, LogoutActivity.class);
        login_button.setOnClickListener(view -> {
            if(login_id_view.getText().toString().equals("dipankar") &&
                    password_view.getText().toString().equals("myname")){
                Toast.makeText(LoginActivity.this,"Login Succesful",Toast.LENGTH_SHORT).show();
                        startActivity(intent);
            } else {
                Toast.makeText(LoginActivity.this,"Login Failed: Incorrect ID or Password",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
