package com.xworkz.object.toString.internal;

public class Freezer {
    private String brand, type;
    private int volume;
    public Freezer(String brand, String type, int volume) {
        this.brand = brand;
        this.type = type;
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "Freezer {Brand:" + this.brand + " Type:" + this.type + " Volume:" + this.volume + "}";
    }
    @Override
    public int hashCode() {
        return 64;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Freezer){
                Freezer freezer=this;
                Freezer freezer2=(Freezer) obj;
                if (freezer.brand.equals(freezer2.brand) && freezer.type.equals(freezer2.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
