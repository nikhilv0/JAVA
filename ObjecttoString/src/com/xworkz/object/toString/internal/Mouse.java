package com.xworkz.object.toString.internal;

public class Mouse {
    private String brand, type;
    private int dpi;
    public Mouse(String brand, String type, int dpi) {
        this.brand = brand;
        this.type = type;
        this.dpi = dpi;
    }
    @Override
    public String toString() {
        return "Mouse {Brand:" + this.brand + " Type:" + this.type + " DPI:" + this.dpi + "}";
    }
    @Override
    public int hashCode() {
        return 39;
    }
}
