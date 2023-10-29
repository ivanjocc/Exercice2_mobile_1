package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    private ListView listView4;
    private List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        this.listView4 = (ListView) findViewById(R.id.list4);

        studentList = new ArrayList<>();

        studentList.add(new Student("Thomas", "94", "Excellent"));
        studentList.add(new Student("Andre", "70", "Bien joué"));
        studentList.add(new Student("Jacques", "60", "Passable"));
        studentList.add(new Student("Pierre", "45", "Désolé"));

        List<String> studentNames = new ArrayList<>();
        for (Student student : studentList) {
            studentNames.add(student.getName());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, studentNames);
        listView4.setAdapter(adapter);

        listView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student selectedStudent = studentList.get(position);

                String message4 = "name: " + selectedStudent.getName() +
                        "\nnote: " + selectedStudent.getGrade() +
                        "\ncomment: " + selectedStudent.getComment();
                Toast.makeText(MainActivity4.this, message4, Toast.LENGTH_LONG).show();
            }
        });

    }
}