package com.xworkz.object.toString.internal;

public class Keyboard {
    String brand, layout;
    boolean isMechanical;
    public Keyboard(String brand, String layout, boolean isMechanical) {
        this.brand = brand;
        this.layout = layout;
        this.isMechanical = isMechanical;
    }
    @Override
    public String toString() {
        return "Keyboard {Brand:" + this.brand + " Layout:" + this.layout + " Mechanical:" + this.isMechanical + "}";
    }
}
