package com.xworkz.object.toString.internal;

public class BreadMaker {
    private String brand, color;
    private int loafSize;
    public BreadMaker(String brand, String color, int loafSize) {
        this.brand = brand;
        this.color = color;
        this.loafSize = loafSize;
    }
    @Override
    public String toString() {
        return "BreadMaker {Brand:" + this.brand + " Color:" + this.color + " LoafSize:" + this.loafSize + "}";
    }
    @Override
    public int hashCode() {
        return 87;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof BreadMaker){
                BreadMaker breadMaker=this;
                BreadMaker breadMaker2=(BreadMaker) obj;
                if (breadMaker.brand.equals(breadMaker2.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
