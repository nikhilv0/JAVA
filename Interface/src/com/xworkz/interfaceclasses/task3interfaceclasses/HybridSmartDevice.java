package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class HybridSmartDevice implements Tablet, VacuumCleaner, SmartPhone, SmartWatch, CeilingFan {
    @Override
    public void draw() {
        System.out.println("Drawing on HybridSmartDevice...");
    }

    @Override
    public void browseWeb() {
        System.out.println("Browsing the web on HybridSmartDevice...");
    }

    @Override
    public void watchVideo() {
        System.out.println("Watching video on HybridSmartDevice...");
    }

    @Override
    public void display() {
        Tablet.super.display();
    }

    @Override
    public void startCleaning() {
        System.out.println("Vacuum cleaning started on HybridSmartDevice...");
    }

    @Override
    public void stopCleaning() {
        System.out.println("Vacuum cleaning stopped on HybridSmartDevice...");
    }

    @Override
    public void emptyDustBag() {
        System.out.println("Emptying dust bag on HybridSmartDevice...");
    }

    @Override
    public void makeCall() {
        System.out.println("Making call using HybridSmartDevice...");
    }

    @Override
    public void sendText() {
        System.out.println("Sending text using HybridSmartDevice...");
    }

    @Override
    public void openApp() {
        System.out.println("Opening app on HybridSmartDevice...");
    }

    @Override
    public void showTime() {
        System.out.println("Showing time on HybridSmartDevice...");
    }

    @Override
    public void trackSteps() {
        System.out.println("Tracking steps with HybridSmartDevice...");
    }

    @Override
    public void displayNotification() {
        System.out.println("Displaying notifications on HybridSmartDevice...");
    }

    @Override
    public void turnOnFan() {
        System.out.println("Fan turned on in HybridSmartDevice...");
    }

    @Override
    public void turnOffFan() {
        System.out.println("Fan turned off in HybridSmartDevice...");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Fan speed adjusted in HybridSmartDevice...");
    }
}
