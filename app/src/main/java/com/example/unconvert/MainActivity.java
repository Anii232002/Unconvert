package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button = findViewById(R.id.btnlength);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(this,length.class);
//                startActivity(intent);
//            }
//        });


    }


    public void weight(View view) {
        Intent intent = new Intent(this, weight.class);
        startActivity(intent);
    }

    public void length(View view) {
        Intent intent = new Intent(this,length.class);
        startActivity(intent);
    }
}