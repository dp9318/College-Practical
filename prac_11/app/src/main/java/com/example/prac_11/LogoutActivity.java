package com.example.prac_11;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
public class LogoutActivity extends AppCompatActivity {
    private Button logout_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout_activity);
        logout_button = findViewById(R.id.logout_button);
        Intent intent_logout = new Intent(this, LoginActivity.class);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        logout_button.setOnClickListener(view -> {
            alertDialog.setTitle("Login App");
            alertDialog.setMessage("Do you want to logout?");
            alertDialog.setNegativeButton("Yes", new
                    DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {
                            startActivity(intent_logout);
                            return;
                        }
                    });
            alertDialog.setPositiveButton("No", (dialogInterface, i) -> {
                return;
            });
            alertDialog.show();
        });
    }
}