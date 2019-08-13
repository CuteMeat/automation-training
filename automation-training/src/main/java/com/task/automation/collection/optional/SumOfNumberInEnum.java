package com.task.automation.collection.optional;

import java.util.ArrayList;

public class SumOfNumberInEnum {
    public static void main(String[] args) {
        ArrayList<Integer> enumSet = new ArrayList<Integer>();

        enumSet.add(5);
        enumSet.add(3);
        enumSet.add(4);
        enumSet.add(1);
        enumSet.add(8);

        while(enumSet.size()!=1) {
            for (int i = 0; i < enumSet.size()-1; i++) {
                enumSet.set(i, (enumSet.get(i)+enumSet.get(i+1)));
                enumSet.remove((i+1));
            }
        }

        System.out.println(enumSet);
    }
}
