package com.task.automation.fundmentals.main;

public class Main {
    public static void main(String[] args) {
        OrdersList orderList = new OrdersList();
        Pizza pizza = new Pizza("Margarita", "Calzone", 2);
        pizza.addIngredient(new TomatoPaste());
        pizza.addIngredient(new Bacon());
        pizza.addIngredient(new Pepper());
        pizza.addIngredient(new Garlic());
        pizza.removeIngredient(2);
        orderList.addPizza(pizza);

        pizza = new Pizza("PepperoniOro", "Base", 3);
        pizza.addIngredient(new TomatoPaste());
        pizza.addIngredient(new Cheese());
        pizza.addIngredient(new Pepperoni());
        pizza.addIngredient(new Olives());
        orderList.addPizza(pizza);
        System.out.println(orderList.toString());

        //orderList.changePizza(0, 0);
        // System.out.println(orderList.toString());
    }
}
