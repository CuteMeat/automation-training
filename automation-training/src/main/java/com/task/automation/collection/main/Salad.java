package com.task.automation.collection.main;

import java.util.ArrayList;
import java.util.Collections;

public class Salad {
    //private String name;
    private ArrayList<Vegetable> vegetables;

    public Salad () {
        vegetables = new ArrayList<Vegetable>();
    }

    public ArrayList<Vegetable> getVegetables() {return vegetables;}

    public void addVegetable(Vegetable newVegetable) {
        Boolean repeatCheck = false;
        for (Vegetable vegetable:vegetables) {
            if (vegetable.name==newVegetable.name) {
                repeatCheck = true;
                System.out.printf("The %s was added earlier\n", newVegetable.name);
                break;
            }
        }

        if (!repeatCheck) vegetables.add(newVegetable);
    }

    public void removeVegetable(int indexOfVegetable) {
        vegetables.remove(indexOfVegetable);
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

    public void findingVegetablesWithCalorieAroundSelected(int minCalorie, int maxCalorie) {
        for (Vegetable vegetable:vegetables) {
            if ((vegetable.getCalorie()>=minCalorie) && (vegetable.getCalorie()<=maxCalorie))
                System.out.println(vegetable.name + ":\t" + vegetable.getCalorie());
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\t\t\t\t==").append("==\t\t\n");
        for (Vegetable vegetable:vegetables) {
            result.append("\t\t").append(vegetable.name).append(": ").append(vegetable.calorie).append("\n");
        }
        result.append("\t\t\tTOTAL CALORIES: ").append(totalCalorie());

        return result.toString();
    }
}
