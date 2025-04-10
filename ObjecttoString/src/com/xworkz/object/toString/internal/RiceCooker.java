package com.xworkz.object.toString.internal;

public class RiceCooker {
    private String brand, type;
    private int capacity;
    public RiceCooker(String brand, String type, int capacity) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "RiceCooker {Brand:" + this.brand + " Type:" + this.type + " Capacity:" + this.capacity + "}";
    }
}
