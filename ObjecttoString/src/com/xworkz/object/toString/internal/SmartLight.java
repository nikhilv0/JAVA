package com.xworkz.object.toString.internal;

public class SmartLight {
    private String brand, color;
    private int lumens;
    public SmartLight(String brand, String color, int lumens) {
        this.brand = brand;
        this.color = color;
        this.lumens = lumens;
    }
    @Override
    public String toString() {
        return "SmartLight {Brand:" + this.brand + " Color:" + this.color + " Lumens:" + this.lumens + "}";
    }
    @Override
    public int hashCode() {
        return 22;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof SmartLight){
                SmartLight smartLight=this;
                SmartLight smartLight2=(SmartLight) obj;
                if (smartLight.brand.equals(smartLight2.brand) && smartLight.color.equals(smartLight2.color) && smartLight.lumens==(smartLight2.lumens)){
                    return true;
                }
            }
        }
        return false;
    }
}
