package com.xworkz.object.toString.internal;

public class SlowCooker {
    String brand, shape;
    int capacity;
    public SlowCooker(String brand, String shape, int capacity) {
        this.brand = brand;
        this.shape = shape;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "SlowCooker {Brand:" + this.brand + " Shape:" + this.shape + " Capacity:" + this.capacity + "}";
    }
}
