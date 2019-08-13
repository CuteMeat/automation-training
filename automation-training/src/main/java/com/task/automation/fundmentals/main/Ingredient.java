package com.task.automation.fundmentals.main;

public class Ingredient {
    String name;
    double price;

    public String getName() {return name;}
    public double getPrice() {return  price;}

    public Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class TomatoPaste extends Ingredient {
    public TomatoPaste() {
        super("Tomato paste", 1);
    }
}

class Cheese extends Ingredient {
    public Cheese() {
        super("Cheese", 1);
    }
}

class Salami extends Ingredient {
    public Salami() {
        super("Salami", 1.5);
    }
}

class Bacon extends Ingredient {
    public Bacon() {
        super("Bacon", 1.2);
    }
}

class Garlic extends Ingredient {
    public Garlic() {
        super("Garlic", 0.3);
    }
}

class Corn extends Ingredient {
    public Corn() {
        super("Corn", 0.3);
    }
}

class Pepperoni extends Ingredient {
    public Pepperoni() {
        super("Pepperoni", 1.50);
    }
}

class Pepper extends Ingredient {
    public Pepper() {
        super("Pepper", 0.6);
    }
}

class Olives extends Ingredient {
    public Olives() {
        super("Olives", 0.50);
    }
}
