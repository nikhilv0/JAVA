package com.xworkz.object.toString.internal;

public class LeafBlower {
    private String brand, type;
    private int airSpeed;
    public LeafBlower(String brand, String type, int airSpeed) {
        this.brand = brand;
        this.type = type;
        this.airSpeed = airSpeed;
    }
    @Override
    public String toString() {
        return "LeafBlower {Brand:" + this.brand + " Type:" + this.type + " AirSpeed:" + this.airSpeed + "}";
    }
    @Override
    public int hashCode() {
        return 47;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof LeafBlower){
                LeafBlower leafBlowe=this;
                LeafBlower leafBlowe2=(LeafBlower) obj;
                if (leafBlowe.brand.equals(leafBlowe2.brand) && leafBlowe.type.equals(leafBlowe2.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
