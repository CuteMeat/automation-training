package com.task.automation.exceptions.main;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Discipline> disciplines;

    public ArrayList<Discipline> getDisciplines() {return disciplines;}
    public String getName() {return name;}

    public Student(String name) {
        this.name = name;
        this.disciplines = new ArrayList<Discipline>();
    }

    public void addDiscipline(Discipline newDiscipline) {
        disciplines.add(newDiscipline);
    }
}
