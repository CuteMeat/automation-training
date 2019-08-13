package com.task.automation.collection.optional;

import java.util.ArrayList;

public class PermutationOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> enumSet = new ArrayList<Integer>();
        enumSet.add(5);
        enumSet.add(-3);
        enumSet.add(-4);
        enumSet.add(1);
        enumSet.add(-8);
        enumSet.add(13);

        for (int i = 0; i < enumSet.size(); i++) {
            if(enumSet.get(i)>0) {
                enumSet.add(0, enumSet.get(i));
                enumSet.remove((i+1));
            }
        }

        for (Integer numbersInEnum: enumSet) {
            System.out.printf("\t%d\t", numbersInEnum);
        }
    }
}
