package com.xworkz.object.toString.internal;

public class SmartLight {
    private String brand, color;
    private int lumens;
    public SmartLight(String brand, String color, int lumens) {
        this.brand = brand;
        this.color = color;
        this.lumens = lumens;
    }
    @Override
    public String toString() {
        return "SmartLight {Brand:" + this.brand + " Color:" + this.color + " Lumens:" + this.lumens + "}";
    }
    @Override
    public int hashCode() {
        return 22;
    }
}
