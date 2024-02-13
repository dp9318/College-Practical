package com.example.prac_8;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public class BlankFragment extends Fragment {
    TextView result;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container,
                false);
        result = (TextView) view.findViewById(R.id.result1);
        return view;
    }
    @Override
    public void onStop(){
        super.onStop();
        String res = result.getText().toString();
        result.setText(res+"\n"+"onStop");
    }
    @Override
    public void onResume(){
        super.onResume();
        String res = result.getText().toString();
        result.setText(res+"\n"+"onResume");
    }
    @Override
    public void onPause(){
        super.onPause();
        String res = result.getText().toString();
        result.setText(res+"\n"+"onPause");
    }
    @Override
    public void onStart(){
        super.onStart();
        String res = result.getText().toString();
        result.setText(res+"\n"+"onStart");
    }
}