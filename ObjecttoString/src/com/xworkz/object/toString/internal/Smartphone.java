package com.xworkz.object.toString.internal;

public class Smartphone {
    private String brand, os;
    private int storage;
    public Smartphone(String brand, String os, int storage) {
        this.brand = brand;
        this.os = os;
        this.storage = storage;
    }
    @Override
    public String toString() {
        return "Smartphone {Brand:" + this.brand + " OS:" + this.os + " Storage:" + this.storage + "}";
    }
    @Override
    public int hashCode() {
        return 21;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Smartphone){
                Smartphone smartphone=this;
                Smartphone smartphone2=(Smartphone) obj;
                if (smartphone.brand.equals(smartphone2.brand) && smartphone.os.equals(smartphone2.os) && smartphone.storage==(smartphone2.storage)){
                    return true;
                }
            }
        }
        return false;
    }
}

