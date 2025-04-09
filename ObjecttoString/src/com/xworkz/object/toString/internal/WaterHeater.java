package com.xworkz.object.toString.internal;

public class WaterHeater {
    String brand, type;
    int liters;
    public WaterHeater(String brand, String type, int liters) {
        this.brand = brand;
        this.type = type;
        this.liters = liters;
    }
    @Override
    public String toString() {
        return "WaterHeater {Brand:" + this.brand + " Type:" + this.type + " Liters:" + this.liters + "}";
    }
}
