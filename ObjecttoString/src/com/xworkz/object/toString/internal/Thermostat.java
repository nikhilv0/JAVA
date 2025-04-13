package com.xworkz.object.toString.internal;

public class Thermostat {
    private String brand, mode;
    private int temperature;
    public Thermostat(String brand, String mode, int temperature) {
        this.brand = brand;
        this.mode = mode;
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return "Thermostat {Brand:" + this.brand + " Mode:" + this.mode + " Temperature:" + this.temperature + "}";
    }

    @Override
    public int hashCode() {
        return 9;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Thermostat){
                Thermostat termostat=this;
                Thermostat termostat2=(Thermostat) obj;
                if (termostat.brand.equals(termostat2.brand) && termostat.mode.equals(termostat2.mode) && termostat.temperature==(termostat2.temperature)){
                    return true;
                }
            }
        }
        return false;
    }
}
