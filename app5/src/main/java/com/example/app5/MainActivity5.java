package com.example.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity5 extends AppCompatActivity {

    private ListView listView5;
    private List<Student2> studentList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        this.listView5 = (ListView) findViewById(R.id.list5);

        studentList2 = new ArrayList<>();

        studentList2.add(new Student2("Thomas", "94", "Excellent"));
        studentList2.add(new Student2("Andre", "70", "Bien joué"));
        studentList2.add(new Student2("Jacques", "60", "Passable"));
        studentList2.add(new Student2("Pierre", "45", "Désolé"));

        List<String> studentNames2 = new ArrayList<>();
        for (Student2 student : studentList2) {
            studentNames2.add(student.getName());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, studentNames2);
        listView5.setAdapter(adapter);

        listView5.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.BLUE);
                return true;
            }
        });
    }
}