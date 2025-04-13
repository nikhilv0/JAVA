package com.xworkz.object.toString.internal;

public class PressureCooker {
    private String brand, color;
    private int psi;

    public PressureCooker(String brand, String color, int psi) {
        this.brand = brand;
        this.color = color;
        this.psi = psi;
    }

    @Override
    public String toString() {
        return "PressureCooker {Brand:" + this.brand + " Color:" + this.color + " PSI:" + this.psi + "}";
    }
    @Override
    public int hashCode() {
        return 34;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof PressureCooker){
                PressureCooker pressureCooker=this;
                PressureCooker pressureCooker2=(PressureCooker) obj;
                if (pressureCooker.brand.equals(pressureCooker2.brand) && pressureCooker.color.equals(pressureCooker2.color) && pressureCooker.psi==(pressureCooker2.psi)){
                    return true;
                }
            }
        }
        return false;
    }
}
