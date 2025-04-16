package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SlowCooker;

public class SlowCookerImpl implements SlowCooker {
    @Override
    public void cookSlow() {
        System.out.println("Cooking slowly.");
    }

    @Override
    public void setTimer() {
        System.out.println("Setting slow cooker timer.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off slow cooker.");
    }
}
