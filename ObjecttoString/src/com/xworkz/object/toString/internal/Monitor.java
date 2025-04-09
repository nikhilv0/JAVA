package com.xworkz.object.toString.internal;

public class Monitor {
    String brand, resolution;
    int size;
    public Monitor(String brand, String resolution, int size) {
        this.brand = brand;
        this.resolution = resolution;
        this.size = size;
    }
    @Override
    public String toString() {
        return "Monitor {Brand:" + this.brand + " Resolution:" + this.resolution + " Size:" + this.size + "}";
    }
}
