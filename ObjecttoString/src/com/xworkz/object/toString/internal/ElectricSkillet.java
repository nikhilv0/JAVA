package com.xworkz.object.toString.internal;

public class ElectricSkillet {
    private String brand, color;
    private int temperatureRange;
    public ElectricSkillet(String brand, String color, int temperatureRange) {
        this.brand = brand;
        this.color = color;
        this.temperatureRange = temperatureRange;
    }
    @Override
    public String toString() {
        return "ElectricSkillet {Brand:" + this.brand + " Color:" + this.color + " TemperatureRange:" + this.temperatureRange + "}";
    }
}
