package com.example.prac_3;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    private EditText username_input;
    private EditText password_input;
    private String correct_username;
    private String correct_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username_input = (EditText) findViewById(R.id.username_input);
        password_input = (EditText) findViewById(R.id.password_input);
        correct_username = "Dipankar";
        correct_password = "dpdpdpdp";
    }
    public void login(View view){
        String username_input_string = username_input.getText().toString();
        String password_input_string = password_input.getText().toString();
        if(!username_input_string.isEmpty() &&
                !password_input_string.isEmpty()){
            if((username_input_string.equals(correct_username) &&
                    (password_input_string.equals(correct_password)))){
                Toast.makeText(getApplicationContext(), "Login successful",
                        Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "Login failed: incorrect username or password", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(getApplicationContext(), "ERROR: username/password field cannot be empty", Toast.LENGTH_SHORT).show();
        }
    }
}
