package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class SmartLivingCompanion implements VacuumCleaner, WaterHeater, SmartWatch, CoffeeMaker, DesktopComputer {
    @Override
    public void startCleaning() {
        System.out.println("SmartLivingCompanion starting vacuum cleaning...");
    }

    @Override
    public void stopCleaning() {
        System.out.println("SmartLivingCompanion stopping vacuum cleaning...");
    }

    @Override
    public void emptyDustBag() {
        System.out.println("SmartLivingCompanion emptying dust bag...");
    }

    @Override
    public void heatWater() {
        System.out.println("SmartLivingCompanion heating water...");
    }

    @Override
    public void turnOffHeater() {
        System.out.println("SmartLivingCompanion turning off heater...");
    }

    @Override
    public void setTemperature() {
        System.out.println("SmartLivingCompanion setting water temperature...");
    }

    @Override
    public void showTime() {
        System.out.println("SmartLivingCompanion showing time...");
    }

    @Override
    public void trackSteps() {
        System.out.println("SmartLivingCompanion tracking steps...");
    }

    @Override
    public void displayNotification() {
        System.out.println("SmartLivingCompanion displaying notification...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("SmartLivingCompanion brewing coffee...");
    }

    @Override
    public void cleanMachine() {
        System.out.println("SmartLivingCompanion cleaning coffee machine...");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartLivingCompanion turning off coffee machine...");
    }

    @Override
    public void powerOn() {
        System.out.println("SmartLivingCompanion powering on desktop...");
    }

    @Override
    public void runDiagnostics() {
        System.out.println("SmartLivingCompanion running diagnostics...");
    }

    @Override
    public void powerOff() {
        System.out.println("SmartLivingCompanion powering off desktop...");
    }
}
