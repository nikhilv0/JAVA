package com.xworkz.object.toString.internal;

public class Iron {
    private String brand, type;
    private int wattage;
    public Iron(String brand, String type, int wattage) {
        this.brand = brand;
        this.type = type;
        this.wattage = wattage;
    }
    @Override
    public String toString() {
        return "Iron {Brand:" + this.brand + " Type:" + this.type + " Wattage:" + this.wattage + "}";
    }
    @Override
    public int hashCode() {
        return 55;
    }
}
