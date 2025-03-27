package com.xworkz.hasasRelation;

public class Battery {
    private String duriation;
    private String brand;
    private Voltage voltage;

    public Voltage getVoltage() {
        return voltage;
    }

    public void setVoltage(Voltage voltage) {
        this.voltage = voltage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDuriation() {
        return duriation;
    }

    public void setDuriation(String duriation) {
        this.duriation = duriation;
    }
}
