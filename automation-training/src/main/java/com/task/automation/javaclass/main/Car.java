package com.task.automation.javaclass.main;

public class Car {
    private int id;
    private String model;
    private  String brand;
    private int year;
    private  String color;
    private  double price;
    private int registrationNumber;

    public int getId() {return id;}
    public String getBrand() {return  brand;}
    public String getModel() {return model;}
    public int getYear() {return year;}
    public String getColor() {return color;}
    public double getPrice() {return price;}
    public int getRegistrationNumber() {return registrationNumber;}

    public void setId(int id) {this.id = id;}
    public void setModel(String model) {this.model = model;}
    public void setBrand(String brand) {this.brand = brand;}
    public void setYear(int year) {this.year = year;}
    public void setColor(String color) {this.color = color;}
    public void setPrice(double price) {this.price = price;}
    public void setRegistrationNumber(int registrationNumber) {this.registrationNumber=registrationNumber;}

    public Car(String brand, String model, String color, int year, double price) {
        this.id = (int)( Math.random() * (10000-1) + 1);
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.registrationNumber =(int)( Math.random() * (10000-1000) + 1000);
    }
    public Car(int id, String brand, String model, String color, int year, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.registrationNumber =(int)( Math.random() * (10000-1000) + 1000);
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\t\t").append(id).append("\t\t").append(getBrand()).append("\t\t").append(getModel());
        str.append("\t\t").append(getYear()).append("\t\t").append(getColor()).append("\t\t").append(getPrice()).append("\t\t").append(getRegistrationNumber()).append("\t");
        return str.toString();
    }
}
