package com.example.prac_6;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.listView);
        TextView textView=(TextView)findViewById(R.id.txtView);
        String[] listItem = {"BSc","BCom","BA"};
        final ArrayAdapter<String> adapter = new
                ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listItem);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((adapterView, view, position, l) -> {
            String value=adapter.getItem(position);
            Log.v("value",value);
            String teacher="";
            switch (value) {
                case "BSc":
                    teacher = "A.B. C";
                    break;
                case "BCom":
                    teacher = "P. QR";
                    break;
                case "BA":
                    teacher = "Gh. J";
                    break;
            }
            Toast.makeText(getApplicationContext(),teacher,Toast.LENGTH_SHORT).show();
        });
    }
}
