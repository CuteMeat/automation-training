package com.task.automation.collection.main;

public class Vegetable {
    public String name;
    public double calorie;


    public Vegetable(String name, double calorie) {
        this.name = name;
        this.calorie = calorie;
    }

    public String getName() {
        return name;
    }

    public double getCalorie() {
        return calorie;
    }
}

class Tomato extends Vegetable {
    public Tomato() {
        super("Tomato", 20);
    }
}

class Cucumber extends Vegetable {
    public Cucumber() {
        super("Cucumbers", 13.5);
    }
}

class Zucchini extends Vegetable{
    public Zucchini() {
        super("Zucchini", 16);
    }
}

class Avocado extends Vegetable {
    public  Avocado() {
        super("Avocado", 160);
    }
}

class Beet extends Vegetable {
    public Beet() {
        super("Beet", 43);
    }
}

class Spinach extends Vegetable {
    public Spinach() {
        super("Spinach", 22);
    }
}
