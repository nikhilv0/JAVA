package com.xworkz.object.toString.internal;

public class DoorLock {
    private String brand, type;
    private int securityLevel;
    public DoorLock(String brand, String type, int securityLevel) {
        this.brand = brand;
        this.type = type;
        this.securityLevel = securityLevel;
    }
    @Override
    public String toString() {
        return "DoorLock {Brand:" + this.brand + " Type:" + this.type + " SecurityLevel:" + this.securityLevel + "}";
    }
}
