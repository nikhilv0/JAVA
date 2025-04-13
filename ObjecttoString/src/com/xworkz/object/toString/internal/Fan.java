package com.xworkz.object.toString.internal;

public class Fan {
    private String brand, type;
    private int blades;
    public Fan(String brand, String type, int blades) {
        this.brand = brand;
        this.type = type;
        this.blades = blades;
    }
    @Override
    public String toString() {
        return "Fan {Brand:" + this.brand + " Type:" + this.type + " Blades:" + this.blades + "}";
    }
    @Override
    public int hashCode() {
        return 66;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Fan){
                Fan fan=this;
                Fan fan2=(Fan) obj;
                if (fan.brand.equals(fan2.brand) && fan.type.equals(fan2.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
