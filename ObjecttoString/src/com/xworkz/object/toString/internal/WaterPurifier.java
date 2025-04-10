package com.xworkz.object.toString.internal;

public class WaterPurifier {
    private String brand, method;
    private int capacity;
    public WaterPurifier(String brand, String method, int capacity) {
        this.brand = brand;
        this.method = method;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "WaterPurifier {Brand:" + this.brand + " Method:" + this.method + " Capacity:" + this.capacity + "}";
    }
}
