package com.xworkz.object.toString.internal;

public class Generator {
    private String brand, fuelType;
    private int wattage;
    public Generator(String brand, String fuelType, int wattage) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.wattage = wattage;
    }
    @Override
    public String toString() {
        return "Generator {Brand:" + this.brand + " FuelType:" + this.fuelType + " Wattage:" + this.wattage + "}";
    }
}
