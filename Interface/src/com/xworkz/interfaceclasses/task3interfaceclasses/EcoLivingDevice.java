package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class EcoLivingDevice implements WaterHeater, SmartPhone, VacuumCleaner, SmartWatch, Tablet {
    @Override
    public void heatWater() {
        System.out.println("EcoLivingDevice heating water...");
    }

    @Override
    public void turnOffHeater() {
        System.out.println("EcoLivingDevice turning off water heater...");
    }

    @Override
    public void setTemperature() {
        System.out.println("EcoLivingDevice setting temperature...");
    }

    @Override
    public void display() {
        WaterHeater.super.display();
    }

    @Override
    public void makeCall() {
        System.out.println("EcoLivingDevice making a call...");
    }

    @Override
    public void sendText() {
        System.out.println("EcoLivingDevice sending a text...");
    }

    @Override
    public void openApp() {
        System.out.println("EcoLivingDevice opening an app...");
    }

    @Override
    public void startCleaning() {
        System.out.println("EcoLivingDevice starting vacuuming...");
    }

    @Override
    public void stopCleaning() {
        System.out.println("EcoLivingDevice stopping vacuuming...");
    }

    @Override
    public void emptyDustBag() {
        System.out.println("EcoLivingDevice emptying dust bag...");
    }

    @Override
    public void showTime() {
        System.out.println("EcoLivingDevice showing time...");
    }

    @Override
    public void trackSteps() {
        System.out.println("EcoLivingDevice tracking steps...");
    }

    @Override
    public void displayNotification() {
        System.out.println("EcoLivingDevice displaying notifications...");
    }

    @Override
    public void draw() {
        System.out.println("EcoLivingDevice drawing...");
    }

    @Override
    public void browseWeb() {
        System.out.println("EcoLivingDevice browsing the web...");
    }

    @Override
    public void watchVideo() {
        System.out.println("EcoLivingDevice watching a video...");
    }
}
