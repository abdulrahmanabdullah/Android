package com.example.abdulrahman.autocompletecolors;

import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView mAutoCompleteTextView;
    String[] SetColors ;
    Button mButton ;
    TextView mTextView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mAutoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextView);
        SetColors = getResources().getStringArray(R.array.Colors_name);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,
                SetColors);
        mAutoCompleteTextView.setThreshold(1);
        mAutoCompleteTextView.setAdapter(adapter);
    }






}
