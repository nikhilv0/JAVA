package com.xworkz.object.toString.internal;

public class LightBulb {
    private String brand, color;
    private int wattage;
    public LightBulb(String brand, String color, int wattage) {
        this.brand = brand;
        this.color = color;
        this.wattage = wattage;
    }
    @Override
    public String toString() {
        return "LightBulb {Brand:" + this.brand + " Color:" + this.color + " Wattage:" + this.wattage + "}";
    }
    @Override
    public int hashCode() {
        return 45;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof LightBulb){
                LightBulb lightBlub=this;
                LightBulb lightBlub2=(LightBulb) obj;
                if (lightBlub.brand.equals(lightBlub2.brand) && lightBlub.color.equals(lightBlub2.color)){
                    return true;
                }
            }
        }
        return false;
    }
}
