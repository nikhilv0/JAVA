package com.xworkz.object.toString.internal;

public class VacuumCleaner {
    private String brand, model;
    private int suctionPower;
    public VacuumCleaner(String brand, String model, int suctionPower) {
        this.brand = brand;
        this.model = model;
        this.suctionPower = suctionPower;
    }
    @Override
    public String toString() {
        return "VacuumCleaner {Brand:" + this.brand + " Model:" + this.model + " SuctionPower:" + this.suctionPower + "}";
    }

    @Override
    public int hashCode() {
        return 5;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof VacuumCleaner){
                VacuumCleaner vaccumCleaner=this;
                VacuumCleaner vaccumCleaner2=(VacuumCleaner) obj;
                if (vaccumCleaner.brand.equals(vaccumCleaner2.brand) && vaccumCleaner.model.equals(vaccumCleaner2.model) && vaccumCleaner.suctionPower==(vaccumCleaner2.suctionPower)){
                    return true;
                }
            }
        }
        return false;
    }
}
