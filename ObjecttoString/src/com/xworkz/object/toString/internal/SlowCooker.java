package com.xworkz.object.toString.internal;

public class SlowCooker {
    private String brand, shape;
    private int capacity;
    public SlowCooker(String brand, String shape, int capacity) {
        this.brand = brand;
        this.shape = shape;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "SlowCooker {Brand:" + this.brand + " Shape:" + this.shape + " Capacity:" + this.capacity + "}";
    }
    @Override
    public int hashCode() {
        return 23;
    }
}
