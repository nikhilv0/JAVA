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
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof SmartWatch){
                SmartWatch smartWatch=this;
                SmartWatch smartWatch2=(SmartWatch) obj;
                if (smartWatch.brand.equals(smartWatch2.brand) && smartWatch.os.equals(smartWatch2.os) && smartWatch.batteryLife==(smartWatch2.batteryLife)){
                    return true;
                }
            }
        }
        return false;
    }
}
