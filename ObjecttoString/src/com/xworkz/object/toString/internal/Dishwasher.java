package com.xworkz.object.toString.internal;

public class Dishwasher {
    private String brand, color;
    private int capacity;
    public Dishwasher(String brand, String color, int capacity) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "Dishwasher {Brand:" + this.brand + " Color:" + this.color + " Capacity:" + this.capacity + "}";
    }
}
