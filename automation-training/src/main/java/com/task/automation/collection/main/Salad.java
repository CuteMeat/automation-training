package com.task.automation.collection.main;

import java.util.ArrayList;
import java.util.Collections;

public class Salad {
    private String name;
    private ArrayList<Vegetable> vegetables;

    public Salad(String name) {
        this.name = name;
        vegetables = new ArrayList<Vegetable>();
    }
    public void addVegetable(Vegetable vegetable) {
        vegetables.add(vegetable);
    }

    public void removeVegetable(Vegetable vegetable) {
        vegetables.remove(vegetable);
    }

    public double totalCalorie() {
        double saladCalories = 0;
        for (int i = 0; i < vegetables.size(); i++) {
            saladCalories+=vegetables.get(i).calorie;
        }
        return saladCalories;
    }

    public void sortByName() {
        Collections.sort(vegetables, new VegetableNameComparator());
    }

    public void sortByCalories() {
        Collections.sort(vegetables, new VegetableCaloriesComparator());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\t\t\t\t==").append(name).append("==\t\t\n");
        for (Vegetable vegetable:vegetables) {
            result.append("\t\t").append(vegetable.name).append(": ").append(vegetable.calorie).append("\n");
        }
        result.append("\t\t\tTOTAL CALORIES: ").append(totalCalorie());

        return result.toString();
    }
}
