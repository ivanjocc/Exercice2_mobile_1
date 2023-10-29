package com.example.app4;

public class Student {
    private String name;
    private String grade;
    private String comment;

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public String getComment() {
        return comment;
    }

    public Student(String name, String grade, String comment){
        this.name = name;
        this.grade = grade;
        this.comment = comment;
    }
}
