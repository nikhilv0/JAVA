package com.xworkz.object.toString.internal;

public class Chainsaw {
    private String brand, model;
    private int barLength;
    public Chainsaw(String brand, String model, int barLength) {
        this.brand = brand;
        this.model = model;
        this.barLength = barLength;
    }
    @Override
    public String toString() {
        return "Chainsaw {Brand:" + this.brand + " Model:" + this.model + " BarLength:" + this.barLength + "}";
    }
    @Override
    public int hashCode() {
        return 84;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Chainsaw){
                Chainsaw chainsaw=this;
                Chainsaw chainsaw2=(Chainsaw) obj;
                if (chainsaw.brand.equals(chainsaw2.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
