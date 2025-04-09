package com.xworkz.object.toString.internal;

public class BreadMaker {
    private String brand, color;
    private int loafSize;
    public BreadMaker(String brand, String color, int loafSize) {
        this.brand = brand;
        this.color = color;
        this.loafSize = loafSize;
    }
    @Override
    public String toString() {
        return "BreadMaker {Brand:" + this.brand + " Color:" + this.color + " LoafSize:" + this.loafSize + "}";
    }
}
