package com.xworkz.object.toString.internal;

public class DeepFryer {
    private String brand, color;
    private int oilCapacity;
    public DeepFryer(String brand, String color, int oilCapacity) {
        this.brand = brand;
        this.color = color;
        this.oilCapacity = oilCapacity;
    }
    @Override
    public String toString() {
        return "DeepFryer {Brand:" + this.brand + " Color:" + this.color + " OilCapacity:" + this.oilCapacity + "}";
    }
}
