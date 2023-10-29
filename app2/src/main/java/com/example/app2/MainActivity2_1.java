package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;

public class MainActivity2_1 extends AppCompatActivity {

    private TextView timeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        timeView = (TextView) findViewById(R.id.timeView);
    }

    public void openActivity2_2(View view){
        Intent intent = new Intent(this, Activity2_2.class);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == 1) {
                String currentTime = data.getStringExtra("current_time");
                timeView.setText(currentTime);
            }
        }
    }
}