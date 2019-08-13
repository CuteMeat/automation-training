package com.task.automation.exceptions.main;

import java.util.ArrayList;

public class Group {
    private String name;
    private ArrayList<Student> students;

    public ArrayList<Student> getStudents() {return students;}
    public String getName() {return name;}

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
    }

    public void addStudent (Student newStudent) {
        students.add(newStudent);
    }
}
