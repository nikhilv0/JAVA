package com.xworkz.object.toString.internal;

public class ToasterOven {
    private String brand, type;
    private int temperatureRange;

    public ToasterOven(String brand, String type, int temperatureRange) {
        this.brand = brand;
        this.type = type;
        this.temperatureRange = temperatureRange;
    }

    @Override
    public String toString() {
        return "ToasterOven {Brand:" + this.brand + " Type:" + this.type + " TemperatureRange:" + this.temperatureRange + "}";
    }

    @Override
    public int hashCode() {
        return 8;
    }@Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof ToasterOven){
                ToasterOven toasterOven=this;
                ToasterOven toasterOven2=(ToasterOven) obj;
                if (toasterOven.brand.equals(toasterOven2.brand) && toasterOven.type.equals(toasterOven2.type) && toasterOven.temperatureRange==(toasterOven2.temperatureRange)){
                    return true;
                }
            }
        }
        return false;
    }
}
