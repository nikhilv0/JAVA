package com.xworkz.object.toString.internal;

public class Blender {
    private String brand, color;
    private int power;
    public Blender(String brand, String color, int power) {
        this.brand = brand;
        this.color = color;
        this.power = power;
    }
    @Override
    public String toString() {
        return "Blender {Brand:" + this.brand + " Color:" + this.color + " Power:" + this.power + "}";
    }
    @Override
    public int hashCode() {
        return 89;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Blender){
                Blender blender=this;
                Blender blender2=(Blender) obj;
                if (blender.brand.equals(blender2.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
