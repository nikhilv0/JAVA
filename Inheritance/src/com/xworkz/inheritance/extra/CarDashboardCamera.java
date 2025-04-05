package com.xworkz.inheritance.extra;

public class CarDashboardCamera extends Product {
    public CarDashboardCamera() {
        super();
        System.out.println("Running constructor of CarDashboardCamera class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying CarDashboardCamera details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating CarDashboardCamera discount");
    }

    public void checkAvailability() {
        System.out.println("Checking CarDashboardCamera availability");
    }

    public void addToCart() {
        System.out.println("CarDashboardCamera added to cart");
    }

    public void purchase() {
        System.out.println("CarDashboardCamera purchased successfully");
    }
}
