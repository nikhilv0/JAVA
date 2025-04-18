package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class DigitalDeskSet implements Laptop, DesktopComputer, CoffeeMaker, SmartWatch, Tablet {
    @Override
    public void compileCode() {
        System.out.println("DigitalDeskSet compiling code...");
    }

    @Override
    public void runApplication() {
        System.out.println("DigitalDeskSet running application...");
    }

    @Override
    public void shutDown() {
        System.out.println("DigitalDeskSet shutting down...");
    }

    @Override
    public void display() {
        Laptop.super.display();
    }

    @Override
    public void powerOn() {
        System.out.println("DigitalDeskSet powering on...");
    }

    @Override
    public void runDiagnostics() {
        System.out.println("DigitalDeskSet running diagnostics...");
    }

    @Override
    public void powerOff() {
        System.out.println("DigitalDeskSet powering off...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("DigitalDeskSet brewing coffee...");
    }

    @Override
    public void cleanMachine() {
        System.out.println("DigitalDeskSet cleaning coffee machine...");
    }

    @Override
    public void turnOff() {
        System.out.println("DigitalDeskSet turning off coffee maker...");
    }

    @Override
    public void showTime() {
        System.out.println("DigitalDeskSet showing time...");
    }

    @Override
    public void trackSteps() {
        System.out.println("DigitalDeskSet tracking steps...");
    }

    @Override
    public void displayNotification() {
        System.out.println("DigitalDeskSet displaying notifications...");
    }

    @Override
    public void draw() {
        System.out.println("DigitalDeskSet drawing...");
    }

    @Override
    public void browseWeb() {
        System.out.println("DigitalDeskSet browsing the web...");
    }

    @Override
    public void watchVideo() {
        System.out.println("DigitalDeskSet watching video...");
    }
}
