package com.xworkz.object.toString.internal;

public class SmartWatch {
    private String brand, os;
    private int batteryLife;
    public SmartWatch(String brand, String os, int batteryLife) {
        this.brand = brand;
        this.os = os;
        this.batteryLife = batteryLife;
    }
    @Override
    public String toString() {
        return "SmartWatch {Brand:" + this.brand + " OS:" + this.os + " BatteryLife:" + this.batteryLife + "}";
    }
    @Override
    public int hashCode() {
        return 19;
    }
}
