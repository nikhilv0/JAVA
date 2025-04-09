package com.xworkz.object.toString.internal;

public class Refrigerator {
    String brand, type;
    int capacity;
    public Refrigerator(String brand, String type, int capacity) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "Refrigerator {Brand: " + this.brand + ", Type: " + this.type + ", Capacity: " + this.capacity + " liters}";
    }
}
