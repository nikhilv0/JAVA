package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.WaterHeater;

public class WaterHeaterImpl implements WaterHeater {
    @Override
    public void heatWater() {
        System.out.println("Water heater is heating water.");
    }

    @Override
    public void turnOffHeater() {
        System.out.println("Water heater turned off.");
    }

    @Override
    public void setTemperature() {
        System.out.println("Setting water heater temperature.");
    }
}
