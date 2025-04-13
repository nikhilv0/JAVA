package com.xworkz.object.toString.internal;

public class Juicer {
    private String brand, type;
    private int power;
    public Juicer(String brand, String type, int power) {
        this.brand = brand;
        this.type = type;
        this.power = power;
    }
    @Override
    public String toString() {
        return "Juicer {Brand:" + this.brand + " Type:" + this.type + " Power:" + this.power + "}";
    }
    @Override
    public int hashCode() {
        return 52;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Juicer){
                Juicer juicer=this;
                Juicer juicer2=(Juicer) obj;
                if (juicer.brand.equals(juicer2.brand) && juicer.type.equals(juicer2.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
