package com.xworkz.object.toString.internal;

public class IceCreamMaker {
    private String brand, type;
    private int batchSize;
    public IceCreamMaker(String brand, String type, int batchSize) {
        this.brand = brand;
        this.type = type;
        this.batchSize = batchSize;
    }
    @Override
    public String toString() {
        return "IceCreamMaker {Brand:" + this.brand + " Type:" + this.type + " BatchSize:" + this.batchSize + "}";
    }
    @Override
    public int hashCode() {
        return 57;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof IceCreamMaker){
                IceCreamMaker iceCreamMaker=this;
                IceCreamMaker iceCreamMaker2=(IceCreamMaker) obj;
                if (iceCreamMaker.brand.equals(iceCreamMaker2.brand) && iceCreamMaker.type.equals(iceCreamMaker2.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
