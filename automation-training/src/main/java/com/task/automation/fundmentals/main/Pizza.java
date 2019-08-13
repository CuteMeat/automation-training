package com.task.automation.fundmentals.main;

public class Pizza {
    private String name;
    private Ingredient[] ingredients;
    private String type;
    private int amount;
    private double price;

    public String getName() {return name;}
    public String getType() {return type;}
    public Ingredient[] getIngredients() {return ingredients;}
    public int getAmount() {return amount;}

    public Pizza (String name, String type, int amount) {
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.ingredients=new Ingredient[0];
        this.price=0;
    }

    public void addIngredient(Ingredient newIngredient) {
        Boolean repeatCheck = false;

        for (Ingredient ingrуdient:ingredients) {
            if(newIngredient.getName()==ingrуdient.getName()) {
                System.out.printf("The %s ingredient was added earlier\n", newIngredient.getName());
                repeatCheck = true;
                break;
            }
        }
        if((ingredients.length<=8) && !repeatCheck) {
            Ingredient[] newIngredients = new Ingredient[ingredients.length+1];
            for (int i = 0; i < newIngredients.length-1; i++) {
                newIngredients[i] = ingredients[i];
            }
            newIngredients[newIngredients.length-1] = newIngredient;
            ingredients = newIngredients;
        }
        else {
            System.out.println("Full pizza");
        }
    }

    public double totalPrice(){
        if(type=="Base")
            price = 1;
        else
            price = 1.5;
        if(ingredients.length!=0) {
            for (int i = 0; i < ingredients.length; i++) {
                price+=ingredients[i].price;
            }
        }
        return price;
    }

    public void changeName(int customerNumber, int pizzaNumber) {
        name = (customerNumber+"_"+pizzaNumber);
    }

    public void removeIngredient(int number){
        if(number>ingredients.length-1 || ingredients.length==0) {
            System.out.println("Error");
        }
        else {
            Ingredient[] newIngredient = new Ingredient[ingredients.length-1];

            for (int i = 0, tmp = 0; i < ingredients.length; i++) {
                if(i!=number) {
                    newIngredient[tmp] = ingredients[i];
                    tmp++;
                }
            }
            ingredients = newIngredient;
        }
    }
}
