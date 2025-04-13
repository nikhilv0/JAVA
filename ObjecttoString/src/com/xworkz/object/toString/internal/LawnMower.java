package com.xworkz.object.toString.internal;

public class LawnMower {
    private String brand, type;
    private int bladeSize;
    public LawnMower(String brand, String type, int bladeSize) {
        this.brand = brand;
        this.type = type;
        this.bladeSize = bladeSize;
    }
    @Override
    public String toString() {
        return "LawnMower {Brand:" + this.brand + " Type:" + this.type + " BladeSize:" + this.bladeSize + "}";
    }
    @Override
    public int hashCode() {
        return 48;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof LawnMower){
                LawnMower lawnMower=this;
                LawnMower lawnMower2=(LawnMower) obj;
                if (lawnMower.brand.equals(lawnMower2.brand) && lawnMower.type.equals(lawnMower2.type)){
                    return true;
                }
            }
        }
        return false;
    }}
