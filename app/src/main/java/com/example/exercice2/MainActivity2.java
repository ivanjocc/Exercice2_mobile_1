package com.example.exercice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

//    private TextView viewA2View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView viewA2View = (TextView) findViewById(R.id.viewA2);

        Intent intent = getIntent();
        if (intent.hasExtra("name")) {
            String name = intent.getStringExtra("name");
            viewA2View.setText("Bonjour " + name + ", bienvenue au cours de Mobile1");
        }
    }
}