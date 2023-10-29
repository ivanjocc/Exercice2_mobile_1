package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2_3 extends AppCompatActivity {

    private TextView activityView31;
    private int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_23);

        activityView31 = findViewById(R.id.view31);

        Intent intent = getIntent();

        if (intent.hasExtra("name")) {
            String name = intent.getStringExtra("name");
            age = intent.getIntExtra("age", 0);
            activityView31.setText("bonjour " + name);
        }
    }

    public void valider3(View view) {
        Intent intent2 = new Intent(this, MainActivity3.class);

        String validationMessage = "";

        if (age > 21) {
            validationMessage = "peut solliciter un prêt bancaire";
        } else if (age > 18) {
            validationMessage = "peut voter";
        } else if (age > 17) {
            validationMessage = "peut louer une voiture";
        } else if (age > 15) {
            validationMessage = "peut pratiquer des sports";
        } else {
            validationMessage = "il y a un problème";
        }

        intent2.putExtra("validationMessage", validationMessage);

        startActivity(intent2);
    }
}