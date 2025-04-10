package com.xworkz.object.toString.internal;

public class WashingMachine {
    private String brand, model;
    private double capacity;
    public WashingMachine(String brand, String model, double capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "WashingMachine {Brand: " + this.brand + ", Model: " + this.model + ", Capacity: " + this.capacity + " kg}";
    }

    @Override
    public int hashCode() {
        return 4;
    }
}
