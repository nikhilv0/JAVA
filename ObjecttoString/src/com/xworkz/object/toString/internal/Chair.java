package com.xworkz.object.toString.internal;

public class Chair {
   private String material, color;
    private double height;
    public Chair(String material, String color, double height) {
        this.material = material;
        this.color = color;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Chair {Material: " + this.material + ", Color: " + this.color + ", Height: " + this.height + " inches}";
    }
    @Override
    public int hashCode() {
        return 83;
    }
}
