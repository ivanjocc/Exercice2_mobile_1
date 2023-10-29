package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private EditText nameTxt;
    private EditText lastTxt;
    private EditText ageTxt;
    private EditText specialiateTxt;
    private TextView validationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        this.nameTxt = (EditText) findViewById(R.id.name3);
        this.lastTxt = (EditText) findViewById(R.id.last3);
        this.ageTxt = (EditText) findViewById(R.id.year3);
        this.specialiateTxt = (EditText) findViewById(R.id.specialite3);
        this.validationView = (TextView) findViewById(R.id.validation3);

        Intent intent3 = getIntent();

        if (intent3.hasExtra("validationMessage")) {
            String message = intent3.getStringExtra("validationMessage");
            validationView.setText(message);
        }
    }

    public void appeler3(View view) {

        String name3 = nameTxt.getText().toString();
        Integer age3 = Integer.parseInt(ageTxt.getText().toString());
        Intent intent = new Intent(this, Activity2_3.class);

        intent.putExtra("name", name3);
        intent.putExtra("age", age3);
        startActivity(intent);
    }


}