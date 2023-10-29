package com.example.exercice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

//    private EditText nom1Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity1_2(View view) {
        EditText nom1Txt = (EditText) findViewById(R.id.name1);
        String name = nom1Txt.getText().toString();

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}