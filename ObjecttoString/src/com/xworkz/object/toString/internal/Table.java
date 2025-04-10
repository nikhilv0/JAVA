package com.xworkz.object.toString.internal;

public class Table {
    private String shape, material;
    private double length;
    public Table(String shape, String material, double length) {
        this.shape = shape;
        this.material = material;
        this.length = length;
    }
    @Override
    public String toString() {
        return "Table {Shape: " + this.shape + ", Material: " + this.material + ", Length: " + this.length + " inches}";
    }

    @Override
    public int hashCode() {
        return 12;
    }
}
