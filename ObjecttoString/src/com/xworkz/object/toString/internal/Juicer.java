package com.xworkz.object.toString.internal;

public class Juicer {
    String brand, type;
    int power;
    public Juicer(String brand, String type, int power) {
        this.brand = brand;
        this.type = type;
        this.power = power;
    }
    @Override
    public String toString() {
        return "Juicer {Brand:" + this.brand + " Type:" + this.type + " Power:" + this.power + "}";
    }
}
