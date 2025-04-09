package com.xworkz.object.toString.internal;

public class ElectricKettle {
    private String brand, material;
    private int capacity;
    public ElectricKettle(String brand, String material, int capacity) {
        this.brand = brand;
        this.material = material;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "ElectricKettle {Brand:" + this.brand + " Material:" + this.material + " Capacity:" + this.capacity + "}";
    }
}
