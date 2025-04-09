package com.xworkz.object.toString.internal;

public class Tablet {
    String brand, os;
    int batteryLife;

    public Tablet(String brand, String os, int batteryLife) {
        this.brand = brand;
        this.os = os;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Tablet {Brand:" + this.brand + " OS:" + this.os + " BatteryLife:" + this.batteryLife + "}";
    }
}
