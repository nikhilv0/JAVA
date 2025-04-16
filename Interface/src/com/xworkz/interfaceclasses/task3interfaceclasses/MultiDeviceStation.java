package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class MultiDeviceStation implements Tablet, SmartPhone, SmartWatch, CoffeeMaker, VacuumCleaner {
    @Override
    public void draw() {
        System.out.println("MultiDeviceStation drawing...");
    }

    @Override
    public void browseWeb() {
        System.out.println("MultiDeviceStation browsing web...");
    }

    @Override
    public void watchVideo() {
        System.out.println("MultiDeviceStation watching video...");
    }

    @Override
    public void makeCall() {
        System.out.println("MultiDeviceStation making a call...");
    }

    @Override
    public void sendText() {
        System.out.println("MultiDeviceStation sending text...");
    }

    @Override
    public void openApp() {
        System.out.println("MultiDeviceStation opening app...");
    }

    @Override
    public void showTime() {
        System.out.println("MultiDeviceStation showing time...");
    }

    @Override
    public void trackSteps() {
        System.out.println("MultiDeviceStation tracking steps...");
    }

    @Override
    public void displayNotification() {
        System.out.println("MultiDeviceStation displaying notifications...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("MultiDeviceStation brewing coffee...");
    }

    @Override
    public void cleanMachine() {
        System.out.println("MultiDeviceStation cleaning machine...");
    }

    @Override
    public void turnOff() {
        System.out.println("MultiDeviceStation turning off coffee maker...");
    }

    @Override
    public void startCleaning() {
        System.out.println("MultiDeviceStation starting vacuum...");
    }

    @Override
    public void stopCleaning() {
        System.out.println("MultiDeviceStation stopping vacuum...");
    }

    @Override
    public void emptyDustBag() {
        System.out.println("MultiDeviceStation emptying dust bag...");
    }
}
