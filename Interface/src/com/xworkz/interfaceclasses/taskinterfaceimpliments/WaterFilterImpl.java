package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.WaterFilter;

public class WaterFilterImpl implements WaterFilter {
    @Override
    public void filterWater() {
        System.out.println("Filtering water.");
    }

    @Override
    public void replaceCartridge() {
        System.out.println("Replacing water filter cartridge.");
    }

    @Override
    public void resetIndicator() {
        System.out.println("Resetting filter indicator.");
    }

    @Override
    public void display() {
        WaterFilter.super.display();
    }
}
