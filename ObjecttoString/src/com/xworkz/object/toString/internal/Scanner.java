package com.xworkz.object.toString.internal;

public class Scanner {
    String brand, type;
    int resolution;
    public Scanner(String brand, String type, int resolution) {
        this.brand = brand;
        this.type = type;
        this.resolution = resolution;
    }
    @Override
    public String toString() {
        return "Scanner {Brand:" + this.brand + " Type:" + this.type + " Resolution:" + this.resolution + "}";
    }
}
