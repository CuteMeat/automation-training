package com.task.automation.exceptions.main;

import com.task.automation.exceptions.main.exception.OutOfRangeOfAcceptableMarkValuesException;

import java.util.ArrayList;
import java.util.HashMap;

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

    public void addMark (int mark) throws OutOfRangeOfAcceptableMarkValuesException {
        if ((mark < 0) || (mark>10)) {
            throw new OutOfRangeOfAcceptableMarkValuesException("Enter mark is incorrect");
        }
        else
            marks.add(mark);
    }
}
