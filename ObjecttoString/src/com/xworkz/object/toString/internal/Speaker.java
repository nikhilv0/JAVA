package com.xworkz.object.toString.internal;

public class Speaker {
    private String brand, type;
    private int wattage;
    public Speaker(String brand, String type, int wattage) {
        this.brand = brand;
        this.type = type;
        this.wattage = wattage;
    }
    @Override
    public String toString() {
        return "Speaker {Brand:" + this.brand + " Type:" + this.type + " Wattage:" + this.wattage + "}";
    }
}
