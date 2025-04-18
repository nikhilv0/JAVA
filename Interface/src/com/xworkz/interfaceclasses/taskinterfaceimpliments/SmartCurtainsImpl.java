package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartCurtains;

public class SmartCurtainsImpl implements SmartCurtains {
    @Override
    public void openCurtains() {
        System.out.println("Opening curtains.");
    }

    @Override
    public void closeCurtains() {
        System.out.println("Closing curtains.");
    }

    @Override
    public void setSchedule() {
        System.out.println("Setting curtain schedule.");
    }

    @Override
    public void display() {
        SmartCurtains.super.display();
    }
}
