package com.xworkz.object.toString.internal;

public class Tablet {
    private String brand, os;
    private int batteryLife;

    public Tablet(String brand, String os, int batteryLife) {
        this.brand = brand;
        this.os = os;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Tablet {Brand:" + this.brand + " OS:" + this.os + " BatteryLife:" + this.batteryLife + "}";
    }

    @Override
    public int hashCode() {
        return 11;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Tablet) {
                Tablet tablet=this;
                Tablet tablet2=(Tablet) obj;
                if (tablet.brand.equals(tablet2.brand) && tablet.os.equals(tablet2.os) && tablet.batteryLife==(tablet2.batteryLife)){
                    return true;
                }
            }
        }
        return false;
    }
}
