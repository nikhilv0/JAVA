package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class AllInOneAssistant implements CoffeeMaker, DesktopComputer, SmartWatch, VacuumCleaner, WaterHeater {
    @Override
    public void brewCoffee() {
        System.out.println("AllInOneAssistant brewing coffee...");
    }

    @Override
    public void cleanMachine() {
        System.out.println("AllInOneAssistant cleaning the coffee maker...");
    }

    @Override
    public void turnOff() {
        System.out.println("AllInOneAssistant turning off the coffee maker...");
    }

    @Override
    public void powerOn() {
        System.out.println("AllInOneAssistant powering on desktop...");
    }

    @Override
    public void runDiagnostics() {
        System.out.println("AllInOneAssistant running diagnostics...");
    }

    @Override
    public void powerOff() {
        System.out.println("AllInOneAssistant powering off desktop...");
    }

    @Override
    public void showTime() {
        System.out.println("AllInOneAssistant showing time...");
    }

    @Override
    public void trackSteps() {
        System.out.println("AllInOneAssistant tracking steps...");
    }

    @Override
    public void displayNotification() {
        System.out.println("AllInOneAssistant displaying notification...");
    }

    @Override
    public void startCleaning() {
        System.out.println("AllInOneAssistant starting vacuum cleaning...");
    }

    @Override
    public void stopCleaning() {
        System.out.println("AllInOneAssistant stopping vacuum cleaning...");
    }

    @Override
    public void emptyDustBag() {
        System.out.println("AllInOneAssistant emptying dust bag...");
    }

    @Override
    public void heatWater() {
        System.out.println("AllInOneAssistant heating water...");
    }

    @Override
    public void turnOffHeater() {
        System.out.println("AllInOneAssistant turning off water heater...");
    }

    @Override
    public void setTemperature() {
        System.out.println("AllInOneAssistant setting water temperature...");
    }
}
