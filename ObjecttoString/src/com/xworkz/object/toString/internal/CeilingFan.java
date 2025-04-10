package com.xworkz.object.toString.internal;

public class CeilingFan {
    private String brand, color;
    private int bladeSize;
    public CeilingFan(String brand, String color, int bladeSize) {
        this.brand = brand;
        this.color = color;
        this.bladeSize = bladeSize;
    }
    @Override
    public String toString() {
        return "CeilingFan {Brand:" + this.brand + " Color:" + this.color + " BladeSize:" + this.bladeSize + "}";
    }
    @Override
    public int hashCode() {
        return 85;
    }
}
