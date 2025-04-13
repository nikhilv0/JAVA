package com.xworkz.object.toString.internal;

public class Heater {
    private String brand, type;
    private int wattage;
    public Heater(String brand, String type, int wattage) {
        this.brand = brand;
        this.type = type;
        this.wattage = wattage;
    }
    @Override
    public String toString() {
        return "Heater {Brand:" + this.brand + " Type:" + this.type + " Wattage:" + this.wattage + "}";
    }
    @Override
    public int hashCode() {
        return 59;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Heater){
                Heater heater=this;
                Heater heater2=(Heater) obj;
                if (heater.brand.equals(heater2.brand) && heater.type.equals(heater2.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
