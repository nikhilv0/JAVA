package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class DailyUtilityCenter implements VacuumCleaner, WaterHeater, SmartWatch, Printer, CeilingFan {
    @Override
    public void startCleaning() {
        System.out.println("DailyUtilityCenter starting cleaning...");
    }

    @Override
    public void stopCleaning() {
        System.out.println("DailyUtilityCenter stopping cleaning...");
    }

    @Override
    public void emptyDustBag() {
        System.out.println("DailyUtilityCenter emptying dust bag...");
    }

    @Override
    public void heatWater() {
        System.out.println("DailyUtilityCenter heating water...");
    }

    @Override
    public void turnOffHeater() {
        System.out.println("DailyUtilityCenter turning off heater...");
    }

    @Override
    public void setTemperature() {
        System.out.println("DailyUtilityCenter setting water temperature...");
    }

    @Override
    public void showTime() {
        System.out.println("DailyUtilityCenter showing time...");
    }

    @Override
    public void trackSteps() {
        System.out.println("DailyUtilityCenter tracking steps...");
    }

    @Override
    public void displayNotification() {
        System.out.println("DailyUtilityCenter displaying notifications...");
    }

    @Override
    public void printDocument() {
        System.out.println("DailyUtilityCenter printing document...");
    }

    @Override
    public void scanDocument() {
        System.out.println("DailyUtilityCenter scanning document...");
    }

    @Override
    public void cancelJob() {
        System.out.println("DailyUtilityCenter cancelling print job...");
    }

    @Override
    public void turnOnFan() {
        System.out.println("DailyUtilityCenter turning on ceiling fan...");
    }

    @Override
    public void turnOffFan() {
        System.out.println("DailyUtilityCenter turning off ceiling fan...");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("DailyUtilityCenter adjusting ceiling fan speed...");
    }

    @Override
    public void display() {
        VacuumCleaner.super.display();
    }
}
