package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class weight extends AppCompatActivity {
        private EditText editText;//important to declare main vairiables here
        private TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        editText = findViewById(R.id.editTextNumber);

    }

    Spinner spinner = (Spinner) findViewById(R.id.spinner1);
    // Create an ArrayAdapter using the string array and a default spinner layout
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.weight_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
// Apply the adapter to the spinner



    }
    public void pounds(View view) {
        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.result);
        String s = editText.getText().toString();
        float r = Integer.parseInt(s);
        double pounds = r*2.205;
        textView.setText("The corresponding weight in pounds is "+ pounds);



    }


    public void ton(View view) {
        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.result);
        String s = editText.getText().toString();
        int r = Integer.parseInt(s);
        double ton = r/907;
        textView.setText("The corresponding weight in ton is "+ ton);
    }
}