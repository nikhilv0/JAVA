package com.xworkz.object.toString.internal;

public class Toaster {
    private String brand, color;
    private int slots;
    public Toaster(String brand, String color, int slots) {
        this.brand = brand;
        this.color = color;
        this.slots = slots;
    }
    @Override
    public String toString() {
        return "Toaster {Brand:" + this.brand + " Color:" + this.color + " Slots:" + this.slots + "}";
    }

    @Override
    public int hashCode() {
        return 7;
    }
}
