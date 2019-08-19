package com.task.automation.fundmentals.main;

public class Main {
    public static void main(String[] args) {
        OrdersList orderList = new OrdersList();
        Pizza pizza = new Pizza("Margarita", "Calzone", 2);
        pizza.addIngredient(new Ingredient("Tomato paste", 1));
        pizza.addIngredient(new Ingredient("Cheese", 1));
        pizza.addIngredient(new Ingredient("Bacon", 1.2));
        pizza.addIngredient(new Ingredient("Garlic", 0.3));
        pizza.removeIngredient(2);
        orderList.addPizza(pizza);

        pizza = new Pizza("PepperoniOro", "Base", 3);
        pizza.addIngredient(new Ingredient("Pepperoni", 1.50));
        pizza.addIngredient(new Ingredient("Pepper", 0.6));
        pizza.addIngredient(new Ingredient("Cheese", 1));
        pizza.addIngredient(new Ingredient("Tomato paste", 1));
        orderList.addPizza(pizza);
        System.out.println(orderList.toString());
    }
}
