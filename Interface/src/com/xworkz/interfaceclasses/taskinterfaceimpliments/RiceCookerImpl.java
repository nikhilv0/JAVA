package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.RiceCooker;

public class RiceCookerImpl implements RiceCooker {
    @Override
    public void startCooking() {
        System.out.println("Starting rice cooking.");
    }

    @Override
    public void keepWarm() {
        System.out.println("Keeping rice warm.");
    }

    @Override
    public void stopCooking() {
        System.out.println("Stopping rice cooking.");
    }
}
