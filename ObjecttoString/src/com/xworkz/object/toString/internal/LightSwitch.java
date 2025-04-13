package com.xworkz.object.toString.internal;

public class LightSwitch {
    private String brand, color;
    private int voltage;
    public LightSwitch(String brand, String color, int voltage) {
        this.brand = brand;
        this.color = color;
        this.voltage = voltage;
    }
    @Override
    public String toString() {
        return "LightSwitch {Brand:" + this.brand + " Color:" + this.color + " Voltage:" + this.voltage + "}";
    }
    @Override
    public int hashCode() {
        return 44;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof LightSwitch){
                LightSwitch lightSwitch=this;
                LightSwitch lightSwitch2=(LightSwitch) obj;
                if (lightSwitch.brand.equals(lightSwitch2.brand) && lightSwitch.color.equals(lightSwitch2.color)){
                    return true;
                }
            }
        }
        return false;
    }
}
