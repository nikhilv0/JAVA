package com.xworkz.object.toString.internal;

public class LightSwitch {
    String brand, color;
    int voltage;
    public LightSwitch(String brand, String color, int voltage) {
        this.brand = brand;
        this.color = color;
        this.voltage = voltage;
    }
    @Override
    public String toString() {
        return "LightSwitch {Brand:" + this.brand + " Color:" + this.color + " Voltage:" + this.voltage + "}";
    }
}
