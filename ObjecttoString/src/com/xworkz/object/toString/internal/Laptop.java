package com.xworkz.object.toString.internal;

public class Laptop {
    private String processor, brand;
    private int ram;
    public Laptop(String processor, String brand, int ram) {
        this.processor = processor;
        this.brand = brand;
        this.ram = ram;
    }
    @Override
    public String toString() {
        return "Laptop {Processor: " + this.processor + ", Brand: " + this.brand + ", RAM: " + this.ram + "GB}";
    }
}
