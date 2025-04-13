package com.xworkz.object.toString.internal;

public class RowingMachine {
    private String brand, model;
    private int maxWeightCapacity;
    public RowingMachine(String brand, String model, int maxWeightCapacity) {
        this.brand = brand;
        this.model = model;
        this.maxWeightCapacity = maxWeightCapacity;
    }
    @Override
    public String toString() {
        return "RowingMachine {Brand:" + this.brand + " Model:" + this.model + " MaxWeightCapacity:" + this.maxWeightCapacity + "}";
    }
    @Override
    public int hashCode() {
        return 28;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof RowingMachine){
                RowingMachine rowingMachie=this;
                RowingMachine rowingMachie2=(RowingMachine) obj;
                if (rowingMachie.brand.equals(rowingMachie2.brand) && rowingMachie.model.equals(rowingMachie2.model) && rowingMachie.maxWeightCapacity==(rowingMachie2.maxWeightCapacity)){
                    return true;
                }
            }
        }
        return false;
    }
}
