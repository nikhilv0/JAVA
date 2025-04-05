package com.xworkz.inheritance.extra;

public class LeatherJacket extends Product {
    public LeatherJacket() {
        super();
        System.out.println("Running constructor of LeatherJacket class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying LeatherJacket details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating LeatherJacket discount");
    }

    public void checkAvailability() {
        System.out.println("Checking LeatherJacket availability");
    }

    public void addToCart() {
        System.out.println("LeatherJacket added to cart");
    }

    public void purchase() {
        System.out.println("LeatherJacket purchased successfully");
    }
}
