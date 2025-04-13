package com.xworkz.object.toString.internal;

public class Dishwasher {
    private String brand, color;
    private int capdishwasherity;
    public Dishwasher(String brand, String color, int capdishwasherity) {
        this.brand = brand;
        this.color = color;
        this.capdishwasherity = capdishwasherity;
    }
    @Override
    public String toString() {
        return "Dishwasher {Brand:" + this.brand + " Color:" + this.color + " Capdishwasherity:" + this.capdishwasherity + "}";
    }
    @Override
    public int hashCode() {
        return 76;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Dishwasher){
                Dishwasher dishwasher=this;
                Dishwasher dishwasher2=(Dishwasher) obj;
                if (dishwasher.brand.equals(dishwasher2.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
