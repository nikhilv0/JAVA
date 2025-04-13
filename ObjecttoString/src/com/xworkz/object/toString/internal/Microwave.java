package com.xworkz.object.toString.internal;

public class Microwave {
    private String brand, color;
    private int power;
    public Microwave(String brand, String color, int power) {
        this.brand = brand;
        this.color = color;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Microwave {Brand: " + this.brand + ", Color: " + this.color;
    }
    @Override
    public int hashCode() {
        return 42;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Microwave){
                Microwave microwave=this;
                Microwave microwave2=(Microwave) obj;
                if (microwave.brand.equals(microwave2.brand) && microwave.color.equals(microwave2.color)){
                    return true;
                }
            }
        }
        return false;
    }
}
