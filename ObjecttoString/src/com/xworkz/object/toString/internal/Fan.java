package com.xworkz.object.toString.internal;

public class Fan {
    private String brand, type;
    private int blades;
    public Fan(String brand, String type, int blades) {
        this.brand = brand;
        this.type = type;
        this.blades = blades;
    }
    @Override
    public String toString() {
        return "Fan {Brand:" + this.brand + " Type:" + this.type + " Blades:" + this.blades + "}";
    }
}
