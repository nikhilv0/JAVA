package com.xworkz.inheritance.extra;

public class Sneakers extends Product {
    public Sneakers() {
        super();
        System.out.println("Running constructor of Sneakers class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying Sneakers details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating Sneakers discount");
    }

    public void checkAvailability() {
        System.out.println("Checking Sneakers availability");
    }

    public void addToCart() {
        System.out.println("Sneakers added to cart");
    }

    public void purchase() {
        System.out.println("Sneakers purchased successfully");
    }
}
