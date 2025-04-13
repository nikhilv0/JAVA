package com.xworkz.object.toString.internal;

public class CoffeeMaker {
    private String brand, model;
    private int cups;
    public CoffeeMaker(String brand, String model, int cups) {
        this.brand = brand;
        this.model = model;
        this.cups = cups;
    }
    @Override
    public String toString() {
        return "CoffeeMaker {Brand:" + this.brand + " Model:" + this.model + " Cups:" + this.cups + "}";
    }
    @Override
    public int hashCode() {
        return 80;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof CoffeeMaker){
                CoffeeMaker coffeMaker=this;
                CoffeeMaker coffeMaker2=(CoffeeMaker) obj;
                if (coffeMaker.brand.equals(coffeMaker2.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
