package com.xworkz.object.toString.internal;

public class Heater {
    private String brand, type;
    private int wattage;
    public Heater(String brand, String type, int wattage) {
        this.brand = brand;
        this.type = type;
        this.wattage = wattage;
    }
    @Override
    public String toString() {
        return "Heater {Brand:" + this.brand + " Type:" + this.type + " Wattage:" + this.wattage + "}";
    }
}
