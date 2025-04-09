package com.xworkz.object.toString.internal;

public class ExternalHardDrive {
    private String brand, type;
    private int capacity;
    public ExternalHardDrive(String brand, String type, int capacity) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "ExternalHardDrive {Brand:" + this.brand + " Type:" + this.type + " Capacity:" + this.capacity + "}";
    }
}
