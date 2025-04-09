package com.xworkz.object.toString.internal;

public class Blender {
    private String brand, color;
    private int power;
    public Blender(String brand, String color, int power) {
        this.brand = brand;
        this.color = color;
        this.power = power;
    }
    @Override
    public String toString() {
        return "Blender {Brand:" + this.brand + " Color:" + this.color + " Power:" + this.power + "}";
    }
}
