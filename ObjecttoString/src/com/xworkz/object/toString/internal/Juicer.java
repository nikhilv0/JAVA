package com.xworkz.object.toString.internal;

public class Juicer {
    private String brand, type;
    private int power;
    public Juicer(String brand, String type, int power) {
        this.brand = brand;
        this.type = type;
        this.power = power;
    }
    @Override
    public String toString() {
        return "Juicer {Brand:" + this.brand + " Type:" + this.type + " Power:" + this.power + "}";
    }
    @Override
    public int hashCode() {
        return 52;
    }
}
