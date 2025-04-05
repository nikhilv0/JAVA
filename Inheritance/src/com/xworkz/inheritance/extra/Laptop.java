package com.xworkz.inheritance.extra;

public class Laptop extends Product {
    public Laptop() {
        super();
        System.out.println("Running constructor of Laptop class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying Laptop details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating Laptop discount");
    }

    public void checkAvailability() {
        System.out.println("Checking Laptop availability");
    }

    public void addToCart() {
        System.out.println("Laptop added to cart");
    }

    public void purchase() {
        System.out.println("Laptop purchased successfully");
    }
}
