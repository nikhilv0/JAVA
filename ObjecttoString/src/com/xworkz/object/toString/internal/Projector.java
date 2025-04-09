package com.xworkz.object.toString.internal;

public class Projector {
    String brand, resolution;
    int lumens;
    public Projector(String brand, String resolution, int lumens) {
        this.brand = brand;
        this.resolution = resolution;
        this.lumens = lumens;
    }
    @Override
    public String toString() {
        return "Projector {Brand:" + this.brand + " Resolution:" + this.resolution + " Lumens:" + this.lumens + "}";
    }
}
