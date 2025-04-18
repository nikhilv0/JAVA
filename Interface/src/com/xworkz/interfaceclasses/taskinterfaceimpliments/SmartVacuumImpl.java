package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartVacuum;

public class SmartVacuumImpl implements SmartVacuum {
    @Override
    public void startCleaning() {
        System.out.println("Smart vacuum started cleaning.");
    }

    @Override
    public void returnToDock() {
        System.out.println("Returning to dock.");
    }

    @Override
    public void emptyDustBin() {
        System.out.println("Emptying dust bin.");
    }

    @Override
    public void display() {
        SmartVacuum.super.display();
    }
}
