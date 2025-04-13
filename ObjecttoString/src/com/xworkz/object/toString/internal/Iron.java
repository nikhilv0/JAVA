package com.xworkz.object.toString.internal;

public class Iron {
    private String brand, type;
    private int wattage;
    public Iron(String brand, String type, int wattage) {
        this.brand = brand;
        this.type = type;
        this.wattage = wattage;
    }
    @Override
    public String toString() {
        return "Iron {Brand:" + this.brand + " Type:" + this.type + " Wattage:" + this.wattage + "}";
    }
    @Override
    public int hashCode() {
        return 55;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Iron){
                Iron iron=this;
                Iron iron2=(Iron) obj;
                if (iron.brand.equals(iron2.brand) && iron.type.equals(iron2.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
