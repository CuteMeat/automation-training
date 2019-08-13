package com.task.automation.fundmentals.main;

public class OrdersList {
    private int orderNumber;
    private int customerNumber;
    private Pizza[] pizzaList;
    private double total;

    public OrdersList() {
        this.orderNumber=(int) ( Math.random() * (100000-10000) + 10000);
        this.customerNumber = (int) ( Math.random() * (100000-10000) + 10000);
        pizzaList = new Pizza[0];
    }

    public void addPizza(Pizza newPizza) {
        Pizza[] pizza = new Pizza[pizzaList.length+1];
        for (int i = 0; i < pizza.length-1; i++) {
            pizza[i] = pizzaList[i];
        }
        pizza[pizza.length-1] = newPizza;
        pizzaList = pizza;
    }

    public void showInfoAboutPizza() {
        System.out.println("Your order");
        for (int i = 0; i < pizzaList.length; i++) {
            System.out.printf("\t%d:%d:%s:%d\t\n", orderNumber, customerNumber, pizzaList[i].getName(), pizzaList[i].getAmount());
        }
    }

    public double getTotal() {
        total = 0;
        for (Pizza item:pizzaList) {
            total+=item.totalPrice()*item.getAmount();
        }
        return total;
    }

    public String toString() {
        StringBuilder outPut = new StringBuilder();
        outPut.append("\t*******************************************\n");
        outPut.append("\tOrder:\t\t\t\t\t\t\t\t").append(orderNumber).append("\n\tCustomer:\t\t\t\t\t\t\t").append(customerNumber);
        for (Pizza item:pizzaList) {
            outPut.append("\n\t-------------------------------------------");
            outPut.append("\n\tPizza name:\t\t\t\t\t").append(item.getName());
            outPut.append("\n\tPizza type:\t\t\t\t\t").append(item.getType());
            for (Ingredient elem:item.getIngredients()) {
                outPut.append("\n\t\t").append(elem.name).append("\n\t\t\t\t\t\t\t\t\t\t"+elem.price);
            }
            outPut.append("\n\t___________________________________________\n");
            outPut.append("\tPrice:\t\t\t").append(item.totalPrice());
            outPut.append("\t\tAmount:\t\t\t").append(item.getAmount());
            outPut.append("\n\t-------------------------------------------\n");
        }
        outPut.append("\t\t==\tTOTAL PRICE:\t").append(getTotal()).append("\t==");
        return outPut.toString();
    }
}
