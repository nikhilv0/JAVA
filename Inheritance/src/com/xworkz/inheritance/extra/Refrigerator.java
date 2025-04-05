package com.xworkz.inheritance.extra;

public class Refrigerator extends Product {
    public Refrigerator() {
        super();
        System.out.println("Running constructor of Refrigerator class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying Refrigerator details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating Refrigerator discount");
    }

    public void checkAvailability() {
        System.out.println("Checking Refrigerator availability");
    }

    public void addToCart() {
        System.out.println("Refrigerator added to cart");
    }

    public void purchase() {
        System.out.println("Refrigerator purchased successfully");
    }
}
