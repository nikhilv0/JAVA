package com.xworkz.object.toString.internal;

public class CoffeeGrinder {
    private String brand, type;
    private int grindSettings;
    public CoffeeGrinder(String brand, String type, int grindSettings) {
        this.brand = brand;
        this.type = type;
        this.grindSettings = grindSettings;
    }
    @Override
    public String toString() {
        return "CoffeeGrinder {Brand:" + this.brand + " Type:" + this.type + " GrindSettings:" + this.grindSettings + "}";
    }
}
