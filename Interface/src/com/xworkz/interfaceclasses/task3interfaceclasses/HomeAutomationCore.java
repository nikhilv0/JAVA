package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class HomeAutomationCore implements VacuumCleaner, CeilingFan, CoffeeMaker, WaterHeater, Printer {
    @Override
    public void startCleaning() {
        System.out.println("HomeAutomationCore starting vacuuming...");
    }

    @Override
    public void stopCleaning() {
        System.out.println("HomeAutomationCore stopping vacuuming...");
    }

    @Override
    public void emptyDustBag() {
        System.out.println("HomeAutomationCore emptying dust bag...");
    }

    @Override
    public void display() {
        VacuumCleaner.super.display();
    }

    @Override
    public void turnOnFan() {
        System.out.println("HomeAutomationCore turning on ceiling fan...");
    }

    @Override
    public void turnOffFan() {
        System.out.println("HomeAutomationCore turning off ceiling fan...");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("HomeAutomationCore adjusting fan speed...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("HomeAutomationCore brewing coffee...");
    }

    @Override
    public void cleanMachine() {
        System.out.println("HomeAutomationCore cleaning coffee maker...");
    }

    @Override
    public void turnOff() {
        System.out.println("HomeAutomationCore turning off coffee maker...");
    }

    @Override
    public void heatWater() {
        System.out.println("HomeAutomationCore heating water...");
    }

    @Override
    public void turnOffHeater() {
        System.out.println("HomeAutomationCore turning off heater...");
    }

    @Override
    public void setTemperature() {
        System.out.println("HomeAutomationCore setting temperature...");
    }

    @Override
    public void printDocument() {
        System.out.println("HomeAutomationCore printing document...");
    }

    @Override
    public void scanDocument() {
        System.out.println("HomeAutomationCore scanning document...");
    }

    @Override
    public void cancelJob() {
        System.out.println("HomeAutomationCore cancelling print job...");
    }
}
