package com.xworkz.object.toString.internal;

public class HairDryer {
   private String brand, color;
   private int heatSettings;
    public HairDryer(String brand, String color, int heatSettings) {
        this.brand = brand;
        this.color = color;
        this.heatSettings = heatSettings;
    }
    @Override
    public String toString() {
        return "HairDryer {Brand:" + this.brand + " Color:" + this.color + " HeatSettings:" + this.heatSettings + "}";
    }
    @Override
    public int hashCode() {
        return 60;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof HairDryer){
                HairDryer hairdryer=this;
                HairDryer hairdryer2=(HairDryer) obj;
                if (hairdryer.brand.equals(hairdryer2.brand) && hairdryer.color.equals(hairdryer2.color)){
                    return true;
                }
            }
        }
        return false;
    }
}
