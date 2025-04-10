package com.xworkz.object.toString.internal;

public class WaterHeater {
    private String brand, type;
    private int liters;
    public WaterHeater(String brand, String type, int liters) {
        this.brand = brand;
        this.type = type;
        this.liters = liters;
    }
    @Override
    public String toString() {
        return "WaterHeater {Brand:" + this.brand + " Type:" + this.type + " Liters:" + this.liters + "}";
    }

    @Override
    public int hashCode() {
        return 3;
    }
}
