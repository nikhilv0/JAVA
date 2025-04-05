package com.xworkz.inheritance.extra;

public class Tablet extends Product {
    public Tablet() {
        super();
        System.out.println("Running constructor of Tablet class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying Tablet details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating Tablet discount");
    }

    public void checkAvailability() {
        System.out.println("Checking Tablet availability");
    }

    public void addToCart() {
        System.out.println("Tablet added to cart");
    }

    public void purchase() {
        System.out.println("Tablet purchased successfully");
    }
}
