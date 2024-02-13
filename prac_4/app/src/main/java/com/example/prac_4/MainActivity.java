package com.example.prac_4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner mySpinner = findViewById(R.id.spinner_selector);
        String[] spinnerItems = getResources().getStringArray(R.array.options);
        ImageView imageView = findViewById(R.id.imageView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, spinnerItems);
        mySpinner.setAdapter(adapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                
                if(selectedItem.equals("Tanjiro Kamodo")){
                    imageView.setImageResource(R.drawable.tanjiro_kamodo);
                }
                else if(selectedItem.equals("Nezuko Kamodo")){
                    imageView.setImageResource(R.drawable.nezuko_kamodo);
                }
                else if(selectedItem.equals("Inosuke Hashibira")){
                    imageView.setImageResource(R.drawable.inosuke_hashibira);
                }
                else if(selectedItem.equals("Zenitsu Agatsuma")){
                    imageView.setImageResource(R.drawable.zenitsu_agatsuma);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}