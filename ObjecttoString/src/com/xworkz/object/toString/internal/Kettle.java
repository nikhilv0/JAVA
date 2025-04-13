package com.xworkz.object.toString.internal;

public class Kettle {
    private String brand, color;
    private int capacity;
    public Kettle(String brand, String color, int capacity) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "Kettle {Brand:" + this.brand + " Color:" + this.color + " Capacity:" + this.capacity + "}";
    }
    @Override
    public int hashCode() {
        return 51;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Kettle){
                Kettle kettle=this;
                Kettle kettle2=(Kettle) obj;
                if (kettle.brand.equals(kettle2.brand) && kettle.color.equals(kettle2.color)){
                    return true;
                }
            }
        }
        return false;
    }
}
