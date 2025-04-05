package com.xworkz.inheritance.extra;

public class Sunglasses extends Product {
    public Sunglasses() {
        super();
        System.out.println("Running constructor of Sunglasses class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying Sunglasses details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating Sunglasses discount");
    }

    public void checkAvailability() {
        System.out.println("Checking Sunglasses availability");
    }

    public void addToCart() {
        System.out.println("Sunglasses added to cart");
    }

    public void purchase() {
        System.out.println("Sunglasses purchased successfully");
    }
}
