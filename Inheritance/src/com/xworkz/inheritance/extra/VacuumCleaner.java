package com.xworkz.inheritance.extra;

public class VacuumCleaner extends Product {
    public VacuumCleaner() {
        super();
        System.out.println("Running constructor of VacuumCleaner class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying VacuumCleaner details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating VacuumCleaner discount");
    }

    public void checkAvailability() {
        System.out.println("Checking VacuumCleaner availability");
    }

    public void addToCart() {
        System.out.println("VacuumCleaner added to cart");
    }

    public void purchase() {
        System.out.println("VacuumCleaner purchased successfully");
    }
}
