package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class length extends AppCompatActivity {
    private EditText editText;//important to declare main vairiables here
    private TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
    }

    public void foot(View view) {
        editText = findViewById(R.id.editTextNumber2);
        textView = findViewById(R.id.result);
        String s = editText.getText().toString();
        int r = Integer.parseInt(s);
        double foot = r*3.281;
        textView.setText("The corresponding height in foot is "+ foot);
    }

    public void inch(View view) {
        editText = findViewById(R.id.editTextNumber2);
        textView = findViewById(R.id.result);
        String s = editText.getText().toString();
        int r = Integer.parseInt(s);
        double inch = r*39.37;
        textView.setText("The corresponding height in inch is "+ inch);
    }
}