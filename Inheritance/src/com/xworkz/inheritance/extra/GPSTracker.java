package com.xworkz.inheritance.extra;

public class GPSTracker extends Product {
    public GPSTracker() {
        super();
        System.out.println("Running constructor of GPSTracker class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying GPSTracker details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating GPSTracker discount");
    }

    public void checkAvailability() {
        System.out.println("Checking GPSTracker availability");
    }

    public void addToCart() {
        System.out.println("GPSTracker added to cart");
    }

    public void purchase() {
        System.out.println("GPSTracker purchased successfully");
    }
}
