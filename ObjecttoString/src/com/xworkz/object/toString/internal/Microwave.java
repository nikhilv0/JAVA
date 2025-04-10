package com.xworkz.object.toString.internal;

public class Microwave {
    private String brand, color;
    private int power;
    public Microwave(String brand, String color, int power) {
        this.brand = brand;
        this.color = color;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Microwave {Brand: " + this.brand + ", Color: " + this.color;
    }
}
