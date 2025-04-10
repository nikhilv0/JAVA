package com.xworkz.object.toString.internal;

public class Oven {
    private String brand, type;
    private int power;
    public Oven(String brand, String type, int power) {
        this.brand = brand;
        this.type = type;
        this.power = power;
    }
    @Override
    public String toString() {
        return "Oven {Brand: " + this.brand + ", Type: " + this.type + ", Power: " + this.power + " watts}";
    }
    @Override
    public int hashCode() {
        return 37;
    }
}
