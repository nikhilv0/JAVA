package com.xworkz.object.toString.internal;

public class Television {
    private String brand, resolution;
    private int size;
    public Television(String brand, String resolution, int size) {
        this.brand = brand;
        this.resolution = resolution;
        this.size = size;
    }
    @Override
    public String toString() {
        return "Television {Brand: " + this.brand + ", Resolution: " + this.resolution + ", Size: " + this.size + " inches}";
    }

    @Override
    public int hashCode() {
        return 10;
    }
}
