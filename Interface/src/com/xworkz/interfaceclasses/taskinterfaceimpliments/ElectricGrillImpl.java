package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ElectricGrill;

public class ElectricGrillImpl implements ElectricGrill {
    @Override
    public void preheat() {
        System.out.println("Preheating electric grill.");
    }

    @Override
    public void grillFood() {
        System.out.println("Grilling food.");
    }

    @Override
    public void turnOffGrill() {
        System.out.println("Turning off electric grill.");
    }
}
