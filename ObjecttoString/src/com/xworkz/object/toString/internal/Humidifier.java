package com.xworkz.object.toString.internal;

public class Humidifier {
    private String brand, type;
    private int tankSize;
    public Humidifier(String brand, String type, int tankSize) {
        this.brand = brand;
        this.type = type;
        this.tankSize = tankSize;
    }
    @Override
    public String toString() {
        return "Humidifier {Brand:" + this.brand + " Type:" + this.type + " TankSize:" + this.tankSize + "}";
    }
    @Override
    public int hashCode() {
        return 58;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Humidifier){
                Humidifier humidifier=this;
                Humidifier humidifier2=(Humidifier) obj;
                if (humidifier.brand.equals(humidifier2.brand) && humidifier.type.equals(humidifier2.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
