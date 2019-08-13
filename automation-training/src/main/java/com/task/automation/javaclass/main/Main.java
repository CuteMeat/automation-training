package com.task.automation.javaclass.main;

public class Main {
    public static void main(String[] args) {
        ListOfCars listOfCars = new ListOfCars();

        listOfCars.addCar(new Car("Audi", "XC-2981", "black", 2000, 9213.12));
        listOfCars.addCar(new Car("Reno", "1231", "red", 2005, 1231));
        listOfCars.addCar(new Car("Audi", "A5", "white", 2010, 100000));
        listOfCars.addCar(new Car("Reno", "AZQS123", "black", 2015, 124124.124));
        listOfCars.addCar(new Car("Reno", "sxz1231", "black", 2010, 95000));
        listOfCars.addCar(new Car("Audi", "XC-2981", "black", 2000, 9213));
        listOfCars.addCar(new Car(0,"Audi", "XC-2981", "black", 2010, 9213.12));
        System.out.println(listOfCars);
        listOfCars.removeCar(0);
        System.out.println("After remove:");
        System.out.println(listOfCars);
        System.out.println("A:");
        listOfCars.showCarOfTheSelectedBrand("Audi");
        System.out.println("B:");
        listOfCars.showCarOfTheSelectedBrandAndOperationTimeIsLongerThen("Reno", 5);
        System.out.println("C:");
        listOfCars.showCarOfTheSelectedYearAndMoreSelectedPrice(2010, 10000);
    }
}
