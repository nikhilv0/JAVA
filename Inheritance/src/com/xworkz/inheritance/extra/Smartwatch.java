package com.xworkz.inheritance.extra;

public class Smartwatch extends Product {
    public Smartwatch() {
        super();
        System.out.println("Running constructor of Smartwatch class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying Smartwatch details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating Smartwatch discount");
    }

    public void checkAvailability() {
        System.out.println("Checking Smartwatch availability");
    }

    public void addToCart() {
        System.out.println("Smartwatch added to cart");
    }

    public void purchase() {
        System.out.println("Smartwatch purchased successfully");
    }
}
