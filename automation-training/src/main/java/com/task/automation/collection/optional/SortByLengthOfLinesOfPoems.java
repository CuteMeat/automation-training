package com.task.automation.collection.optional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByLengthOfLinesOfPoems {
    public static void main(String[] args) {
        ArrayList<String> nameOfPoems = new ArrayList<String>();
        nameOfPoems.add("Косой дождь");
        nameOfPoems.add("Абсурдный час");
        nameOfPoems.add("Абажур");
        nameOfPoems.add("Мамин сорванец");
        nameOfPoems.add("Песня");

        Collections.sort(nameOfPoems, new SortByLenght());

        for (String poemsLines: nameOfPoems) {
            System.out.println(poemsLines);
        }
    }
}

class SortByLenght implements Comparator<String> {
    public int compare (String first, String second) {
        if(first.length()<second.length()) return -1;
        if(first.length()>second.length()) return 1;
        else return 0;
    }
}
