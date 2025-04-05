package com.xworkz.inheritance.extra;

public class SmartFitnessBand extends Product {
    public SmartFitnessBand() {
        super();
        System.out.println("Running constructor of SmartFitnessBand class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying SmartFitnessBand details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating SmartFitnessBand discount");
    }

    public void checkAvailability() {
        System.out.println("Checking SmartFitnessBand availability");
    }

    public void addToCart() {
        System.out.println("SmartFitnessBand added to cart");
    }

    public void purchase() {
        System.out.println("SmartFitnessBand purchased successfully");
    }
}
