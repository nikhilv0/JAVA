package com.xworkz.object.toString.internal;

public class Toaster {
    String brand, color;
    int slots;
    public Toaster(String brand, String color, int slots) {
        this.brand = brand;
        this.color = color;
        this.slots = slots;
    }
    @Override
    public String toString() {
        return "Toaster {Brand:" + this.brand + " Color:" + this.color + " Slots:" + this.slots + "}";
    }
}
