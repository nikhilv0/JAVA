package com.xworkz.object.toString.internal;

public class GPSDevice {
    private String brand, mapVersion;
    private int batteryLife;
    public GPSDevice(String brand, String mapVersion, int batteryLife) {
        this.brand = brand;
        this.mapVersion = mapVersion;
        this.batteryLife = batteryLife;
    }
    @Override
    public String toString() {
        return "GPSDevice {Brand:" + this.brand + " MapVersion:" + this.mapVersion + " BatteryLife:" + this.batteryLife + "}";
    }
    @Override
    public int hashCode() {
        return 61;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof GPSDevice){
                GPSDevice gps=this;
                GPSDevice gps2=(GPSDevice) obj;
                if (gps.brand.equals(gps2.brand) && gps.mapVersion.equals(gps2.mapVersion)){
                    return true;
                }
            }
        }
        return false;
    }
}
