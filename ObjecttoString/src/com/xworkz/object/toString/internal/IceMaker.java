package com.xworkz.object.toString.internal;

public class IceMaker {
    private String brand, model;
    private int dailyProduction;
    public IceMaker(String brand, String model, int dailyProduction) {
        this.brand = brand;
        this.model = model;
        this.dailyProduction = dailyProduction;
    }
    @Override
    public String toString() {
        return "IceMaker {Brand:" + this.brand + " Model:" + this.model + " DailyProduction:" + this.dailyProduction + "}";
    }
    @Override
    public int hashCode() {
        return 56;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof IceMaker){
                IceMaker iceMaker=this;
                IceMaker iceMaker2=(IceMaker) obj;
                if (iceMaker.brand.equals(iceMaker2.brand) && iceMaker.model.equals(iceMaker2.model)){
                    return true;
                }
            }
        }
        return false;
    }
}
