package com.task.automation.collection.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static ArrayList<Salad> salads = new ArrayList<Salad>();
    public static void main(String[] args) {
        // write your code here
//        ArrayList<Salad> salads = new ArrayList<Salad>();
//        salads.add(new Salad("Salad1"));
//        ArrayList<Vegetable> vegetables = new ArrayList<Vegetable>();
//        vegetables.add(new Zucchini());
//        vegetables.add(new Tomato());
//        vegetables.add(new Avocado());
//
//        //salads.get(0).addVegetable(vegetables);
//
//        System.out.println(salads.get(0));
//
//        salads.get(0).sortByName();
//        System.out.println((salads.get(0)));
//
//        salads.get(0).sortByCalories();1
//        System.out.println((salads.get(0)));
//
//        salads.get(0).removeVegetable(vegetables.get(1));
//        System.out.println((salads.get(0)));
        mainMenu();
        
    }
    
    public static void mainMenu() {
        System.out.println("1. Create salad");
        System.out.println("2. Exit program;");

        int check = in.nextInt();

        switch (check) {
            case 1:
                clearScreen();
                createSalad();
                break;
            case 2:
                clearScreen();
            case 3:
                in.close();
            default:
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void createSalad() {
        System.out.print("Enter name of salad: ");
        String nameOfSalad = in.nextLine();
        salads.add(new Salad(nameOfSalad));
        int check;

        System.out.println("1. Add vegetable;");
        System.out.println("2. Remove vegetable;");
        System.out.println("3. Save salad.");

        check = in.nextInt();

        switch (check) {
            case 1:
                clearScreen();
                menuForAddingVegetables();
                break;
            case 2:
                break;
            case 3:
                mainMenu();
                break;
            default:                
        }
    }

    public static void saladView() {
        for (Salad salad:salads) {
            System.out.println(salad);
        }

        System.out.println("1. Sort by name;");
        System.out.println("2. Sort by calories;");
        System.out.println("3. Find vegetables with selected calorie;");
        System.out.println("4. Exit;");

        int check = in.nextInt();

        switch (check) {
            case 1:
                clearScreen();
                for (Salad salad:salads) {
                    salad.sortByName();
                    System.out.println(salad);
                }
                break;
            case 2:
                clearScreen();
                for (Salad salad:salads) {
                    salad.sortByCalories();
                    System.out.println(salad);
                }
                break;
            case 3:

                break;
            case 4:
                mainMenu();
                break;
            default:
        }
    }

    public static void menuForAddingVegetables() {
        System.out.println("Select vegetable:");
        System.out.println("1. Avocado;");
        System.out.println("2. Beet;");
        System.out.println("3. Cucumber;");
        System.out.println("4. Spinach;");
        System.out.println("5. Tomato;");
        System.out.println("6. Zucchini;");



        while (salads.size()<=6) {
            int check = in.nextInt();
            switch (check) {
                case 1:
                    salads.get(salads.size()-1).addVegetable(new Avocado());
                    break;
                case 2:
                    salads.get(salads.size()-1).addVegetable(new Beet());
                    break;
                case 3:
                    salads.get(salads.size()-1).addVegetable(new Cucumber());
                    break;
                case 4:
                    salads.get(salads.size()-1).addVegetable(new Spinach());
                    break;
                case 5:
                    salads.get(salads.size()-1).addVegetable(new Tomato());
                    break;
                case 6:
                    salads.get(salads.size()-1).addVegetable(new Zucchini());
                    break;
                default:
                    System.out.println("Error.");
            }
        }
    }
}
