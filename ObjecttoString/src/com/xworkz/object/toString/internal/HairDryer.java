package com.xworkz.object.toString.internal;

public class HairDryer {
   private String brand, color;
   private int heatSettings;
    public HairDryer(String brand, String color, int heatSettings) {
        this.brand = brand;
        this.color = color;
        this.heatSettings = heatSettings;
    }
    @Override
    public String toString() {
        return "HairDryer {Brand:" + this.brand + " Color:" + this.color + " HeatSettings:" + this.heatSettings + "}";
    }
}
