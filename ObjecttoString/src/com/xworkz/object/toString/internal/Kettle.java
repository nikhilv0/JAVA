package com.xworkz.object.toString.internal;

public class Kettle {
    private String brand, color;
    private int capacity;
    public Kettle(String brand, String color, int capacity) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "Kettle {Brand:" + this.brand + " Color:" + this.color + " Capacity:" + this.capacity + "}";
    }
}
