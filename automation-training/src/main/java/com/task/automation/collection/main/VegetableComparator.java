package com.task.automation.collection.main;

import java.util.Comparator;

class VegetableNameComparator implements Comparator<Vegetable> {
    public int compare(Vegetable first, Vegetable second){

        return first.getName().compareTo(second.getName());
    }
}

class VegetableCaloriesComparator implements Comparator<Vegetable> {
    public int compare(Vegetable first, Vegetable second) {
        if(first.getCalorie()>second.getCalorie())
            return 1;
        if(first.getCalorie()<second.getCalorie())
            return -1;
        else
            return 0;
    }
}
