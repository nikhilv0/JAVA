package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.IceMaker;

public class IceMakerImpl implements IceMaker {
    @Override
    public void startIceMaking() {
        System.out.println("Starting ice making.");
    }

    @Override
    public void stopIceMaking() {
        System.out.println("Stopping ice making.");
    }

    @Override
    public void checkIceLevel() {
        System.out.println("Checking ice level.");
    }

    @Override
    public void display() {
        IceMaker.super.display();
    }
}
