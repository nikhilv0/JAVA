package com.xworkz.object.toString.internal;

public class Dehydrator {
    private String brand, type;
    public int trayCount;
    public Dehydrator(String brand, String type, int trayCount) {
        this.brand = brand;
        this.type = type;
        this.trayCount = trayCount;
    }
    @Override
    public String toString() {
        return "Dehydrator {Brand:" + this.brand + " Type:" + this.type + " TrayCount:" + this.trayCount + "}";
    }
    @Override
    public int hashCode() {
        return 77;
    }
}
