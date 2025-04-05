package com.xworkz.inheritance.extra;

public class BluetoothCarAdapter extends Product {
    public BluetoothCarAdapter() {
        super();
        System.out.println("Running constructor of BluetoothCarAdapter class");
    }
    @Override
    public void displayDetails() {
        System.out.println("Displaying BluetoothCarAdapter details.");
    }

    public void calculateDiscount() {
        System.out.println("Calculating BluetoothCarAdapter discount");
    }

    public void checkAvailability() {
        System.out.println("Checking BluetoothCarAdapter availability");
    }

    public void addToCart() {
        System.out.println("BluetoothCarAdapter added to cart");
    }

    public void purchase() {
        System.out.println("BluetoothCarAdapter purchased successfully");
    }
}
