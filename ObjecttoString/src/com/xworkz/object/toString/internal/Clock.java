package com.xworkz.object.toString.internal;

public class Clock {
    private String brand, type;
    private boolean isDigital;
    public Clock(String brand, String type, boolean isDigital) {
        this.brand = brand;
        this.type = type;
        this.isDigital = isDigital;
    }
    @Override
    public String toString() {
        return "Clock {Brand:" + this.brand + " Type:" + this.type + " Digital:" + this.isDigital + "}";
    }
    @Override
    public int hashCode() {
        return 82;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Clock){
                Clock clock=this;
                Clock clock2=(Clock) obj;
                if (clock.brand.equals(clock2.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
