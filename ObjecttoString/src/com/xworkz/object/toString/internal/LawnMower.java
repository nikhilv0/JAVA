package com.xworkz.object.toString.internal;

public class LawnMower {
    String brand, type;
    int bladeSize;
    public LawnMower(String brand, String type, int bladeSize) {
        this.brand = brand;
        this.type = type;
        this.bladeSize = bladeSize;
    }
    @Override
    public String toString() {
        return "LawnMower {Brand:" + this.brand + " Type:" + this.type + " BladeSize:" + this.bladeSize + "}";
    }
}
