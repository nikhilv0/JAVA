package com.xworkz.object.toString.internal;

public class LightBulb {
    String brand, color;
    int wattage;
    public LightBulb(String brand, String color, int wattage) {
        this.brand = brand;
        this.color = color;
        this.wattage = wattage;
    }
    @Override
    public String toString() {
        return "LightBulb {Brand:" + this.brand + " Color:" + this.color + " Wattage:" + this.wattage + "}";
    }
}
