package com.xworkz.inheritance.extra;

public class AirConditioner extends Product {
    public AirConditioner() {
        super();
        System.out.println("Running constructor of AirConditioner class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying AirConditioner details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating AirConditioner discount");
    }

    public void checkAvailability() {
        System.out.println("Checking AirConditioner availability");
    }

    public void addToCart() {
        System.out.println("AirConditioner added to cart");
    }

    public void purchase() {
        System.out.println("AirConditioner purchased successfully");
    }
}
