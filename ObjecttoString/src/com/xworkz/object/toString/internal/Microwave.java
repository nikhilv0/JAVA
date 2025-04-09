package com.xworkz.object.toString.internal;

public class Microwave {
    String brand, color;
    int power;

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
