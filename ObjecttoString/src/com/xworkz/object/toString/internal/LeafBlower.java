package com.xworkz.object.toString.internal;

public class LeafBlower {
    String brand, type;
    int airSpeed;
    public LeafBlower(String brand, String type, int airSpeed) {
        this.brand = brand;
        this.type = type;
        this.airSpeed = airSpeed;
    }
    @Override
    public String toString() {
        return "LeafBlower {Brand:" + this.brand + " Type:" + this.type + " AirSpeed:" + this.airSpeed + "}";
    }
}
