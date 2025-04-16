package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartGarageOpener;

public class SmartGarageOpenerImpl implements SmartGarageOpener {
    @Override
    public void openGarage() {
        System.out.println("Opening garage.");
    }

    @Override
    public void closeGarage() {
        System.out.println("Closing garage.");
    }

    @Override
    public void checkGarageStatus() {
        System.out.println("Checking garage status.");
    }
}
