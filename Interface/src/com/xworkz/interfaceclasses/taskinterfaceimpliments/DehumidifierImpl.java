package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Dehumidifier;

public class DehumidifierImpl implements Dehumidifier {
    @Override
    public void removeMoisture() {
        System.out.println("Removing moisture.");
    }

    @Override
    public void setDryLevel() {
        System.out.println("Setting dry level.");
    }

    @Override
    public void emptyTank() {
        System.out.println("Emptying dehumidifier tank.");
    }
}
