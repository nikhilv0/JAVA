package com.xworkz.inheritance.extra;

public class ElectricScooter extends Product {
    public ElectricScooter() {
        super();
        System.out.println("Running constructor of ElectricScooter class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying ElectricScooter details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating ElectricScooter discount");
    }

    public void checkAvailability() {
        System.out.println("Checking ElectricScooter availability");
    }

    public void addToCart() {
        System.out.println("ElectricScooter added to cart");
    }

    public void purchase() {
        System.out.println("ElectricScooter purchased successfully");
    }
}
