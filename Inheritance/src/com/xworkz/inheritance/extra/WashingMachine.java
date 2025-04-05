package com.xworkz.inheritance.extra;

public class WashingMachine extends Product {
    public WashingMachine() {
        super();
        System.out.println("Running constructor of WashingMachine class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying WashingMachine details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating WashingMachine discount");
    }

    public void checkAvailability() {
        System.out.println("Checking WashingMachine availability");
    }

    public void addToCart() {
        System.out.println("WashingMachine added to cart");
    }

    public void purchase() {
        System.out.println("WashingMachine purchased successfully");
    }
}
