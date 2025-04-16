package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.CoffeeMaker;

public class CoffeeMakerImpl implements CoffeeMaker {
    @Override
    public void brewCoffee() {
        System.out.println("Brewing coffee.");
    }

    @Override
    public void cleanMachine() {
        System.out.println("Cleaning coffee maker.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off coffee maker.");
    }
}
