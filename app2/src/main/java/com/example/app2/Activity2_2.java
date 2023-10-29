package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Activity2_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_22);

        String currentTime = getCurrentTime();

        Intent resultIntent = new Intent();
        resultIntent.putExtra("current_time", currentTime);
        setResult(RESULT_OK, resultIntent);
        finish();
    }

    private String getCurrentTime() {
        SimpleDateFormat date = new SimpleDateFormat("HH:mm:ss");
        return date.format(new Date());
    }
}