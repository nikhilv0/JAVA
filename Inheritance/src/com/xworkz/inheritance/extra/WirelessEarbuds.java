package com.xworkz.inheritance.extra;

public class WirelessEarbuds extends Product {
    public WirelessEarbuds() {
        super();
        System.out.println("Running constructor of WirelessEarbuds class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying WirelessEarbuds details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating WirelessEarbuds discount");
    }

    public void checkAvailability() {
        System.out.println("Checking WirelessEarbuds availability");
    }

    public void addToCart() {
        System.out.println("WirelessEarbuds added to cart");
    }

    public void purchase() {
        System.out.println("WirelessEarbuds purchased successfully");
    }
}
