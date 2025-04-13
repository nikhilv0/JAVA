package com.xworkz.object.toString.internal;

public class CeilingFan {
    private String brand, color;
    private int bladeSize;
    public CeilingFan(String brand, String color, int bladeSize) {
        this.brand = brand;
        this.color = color;
        this.bladeSize = bladeSize;
    }
    @Override
    public String toString() {
        return "CeilingFan {Brand:" + this.brand + " Color:" + this.color + " BladeSize:" + this.bladeSize + "}";
    }
    @Override
    public int hashCode() {
        return 85;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof CeilingFan){
                CeilingFan Cfan=this;
                CeilingFan Cfan2=(CeilingFan) obj;
                if (Cfan.brand.equals(Cfan2.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
