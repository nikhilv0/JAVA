package com.xworkz.inheritance.extra;

public class MicrowaveOven extends Product {
    public MicrowaveOven() {
        super();
        System.out.println("Running constructor of MicrowaveOven class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying MicrowaveOven details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating MicrowaveOven discount");
    }

    public void checkAvailability() {
        System.out.println("Checking MicrowaveOven availability");
    }

    public void addToCart() {
        System.out.println("MicrowaveOven added to cart");
    }

    public void purchase() {
        System.out.println("MicrowaveOven purchased successfully");
    }
}
