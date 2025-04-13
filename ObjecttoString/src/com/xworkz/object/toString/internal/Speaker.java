package com.xworkz.object.toString.internal;

public class Speaker {
    private String brand, type;
    private int wattage;
    public Speaker(String brand, String type, int wattage) {
        this.brand = brand;
        this.type = type;
        this.wattage = wattage;
    }
    @Override
    public String toString() {
        return "Speaker {Brand:" + this.brand + " Type:" + this.type + " Wattage:" + this.wattage + "}";
    }
    @Override
    public int hashCode() {
        return 15;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Speaker){
                Speaker speaker=this;
                Speaker speaker2=(Speaker) obj;
                if (speaker.brand.equals(speaker2.brand) && speaker.type.equals(speaker2.type) && speaker.wattage==(speaker2.wattage)){
                    return true;
                }
            }
        }
        return false;
    }
}
