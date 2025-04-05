package com.xworkz.inheritance.extra;

// 20 Product classes extending Product
public class Smartphone extends Product {
    public Smartphone() {
        super();
        System.out.println("Running constructor of Smartphone class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying Smartphone details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating Smartphone discount");
    }

    public void checkAvailability() {
        System.out.println("Checking Smartphone availability");
    }

    public void addToCart() {
        System.out.println("Smartphone added to cart");
    }

    public void purchase() {
        System.out.println("Smartphone purchased successfully");
    }
}
