package com.task.automation.exceptions.main;

import com.task.automation.exceptions.main.exception.MarkOutOfBoundsException;

import java.util.ArrayList;

public class Discipline {
    private String name;
    private ArrayList<Integer> marks;

    public String getName() {return name;}
    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public Discipline(String name) {
        this.name = name;
        this.marks = new ArrayList<Integer>();
    }

    public void addMark (int mark) throws MarkOutOfBoundsException {
        if ((mark < 0) || (mark>10)) {
            throw new MarkOutOfBoundsException("Enter mark is incorrect");
        }
        else
            marks.add(mark);
    }
}
