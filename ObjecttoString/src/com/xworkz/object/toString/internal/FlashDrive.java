package com.xworkz.object.toString.internal;

public class FlashDrive {
    private String brand, type;
    private int capacity;
    public FlashDrive(String brand, String type, int capacity) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "FlashDrive {Brand:" + this.brand + " Type:" + this.type + " Capacity:" + this.capacity + "}";
    }
}
