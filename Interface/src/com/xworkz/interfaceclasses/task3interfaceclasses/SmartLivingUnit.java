package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class SmartLivingUnit implements SmartWatch, CeilingFan, Laptop, VacuumCleaner, WaterHeater {
    @Override
    public void showTime() {
        System.out.println("SmartLivingUnit showing time...");
    }

    @Override
    public void trackSteps() {
        System.out.println("SmartLivingUnit tracking steps...");
    }

    @Override
    public void displayNotification() {
        System.out.println("SmartLivingUnit displaying notification...");
    }

    @Override
    public void display() {
        SmartWatch.super.display();
    }

    @Override
    public void turnOnFan() {
        System.out.println("SmartLivingUnit turning on fan...");
    }

    @Override
    public void turnOffFan() {
        System.out.println("SmartLivingUnit turning off fan...");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("SmartLivingUnit adjusting fan speed...");
    }

    @Override
    public void compileCode() {
        System.out.println("SmartLivingUnit compiling code...");
    }

    @Override
    public void runApplication() {
        System.out.println("SmartLivingUnit running app...");
    }

    @Override
    public void shutDown() {
        System.out.println("SmartLivingUnit shutting down...");
    }

    @Override
    public void startCleaning() {
        System.out.println("SmartLivingUnit starting cleaning...");
    }

    @Override
    public void stopCleaning() {
        System.out.println("SmartLivingUnit stopping cleaning...");
    }

    @Override
    public void emptyDustBag() {
        System.out.println("SmartLivingUnit emptying dust bag...");
    }

    @Override
    public void heatWater() {
        System.out.println("SmartLivingUnit heating water...");
    }

    @Override
    public void turnOffHeater() {
        System.out.println("SmartLivingUnit turning off heater...");
    }

    @Override
    public void setTemperature() {
        System.out.println("SmartLivingUnit setting water temperature...");
    }
}
