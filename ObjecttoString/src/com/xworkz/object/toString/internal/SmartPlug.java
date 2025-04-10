package com.xworkz.object.toString.internal;

public class SmartPlug {
    private String brand, type;
    private int voltage;
    public SmartPlug(String brand, String type, int voltage) {
        this.brand = brand;
        this.type = type;
        this.voltage = voltage;
    }
    @Override
    public String toString() {
        return "SmartPlug {Brand:" + this.brand + " Type:" + this.type + " Voltage:" + this.voltage + "}";
    }
    @Override
    public int hashCode() {
        return 20;
    }
}
