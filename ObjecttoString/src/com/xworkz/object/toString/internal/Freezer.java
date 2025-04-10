package com.xworkz.object.toString.internal;

public class Freezer {
    private String brand, type;
    private int volume;
    public Freezer(String brand, String type, int volume) {
        this.brand = brand;
        this.type = type;
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "Freezer {Brand:" + this.brand + " Type:" + this.type + " Volume:" + this.volume + "}";
    }
    @Override
    public int hashCode() {
        return 64;
    }
}
