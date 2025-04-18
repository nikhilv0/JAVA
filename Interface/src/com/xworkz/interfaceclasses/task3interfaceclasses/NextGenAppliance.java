package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class NextGenAppliance implements CoffeeMaker, VacuumCleaner, Printer, CeilingFan, Tablet {
    @Override
    public void brewCoffee() {
        System.out.println("NextGenAppliance brewing coffee...");
    }

    @Override
    public void cleanMachine() {
        System.out.println("NextGenAppliance cleaning machine...");
    }

    @Override
    public void turnOff() {
        System.out.println("NextGenAppliance turning off...");
    }

    @Override
    public void display() {
        CoffeeMaker.super.display();
    }

    @Override
    public void startCleaning() {
        System.out.println("NextGenAppliance starting vacuum...");
    }

    @Override
    public void stopCleaning() {
        System.out.println("NextGenAppliance stopping vacuum...");
    }

    @Override
    public void emptyDustBag() {
        System.out.println("NextGenAppliance emptying dust bag...");
    }

    @Override
    public void printDocument() {
        System.out.println("NextGenAppliance printing document...");
    }

    @Override
    public void scanDocument() {
        System.out.println("NextGenAppliance scanning document...");
    }

    @Override
    public void cancelJob() {
        System.out.println("NextGenAppliance cancelling job...");
    }

    @Override
    public void turnOnFan() {
        System.out.println("NextGenAppliance turning on fan...");
    }

    @Override
    public void turnOffFan() {
        System.out.println("NextGenAppliance turning off fan...");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("NextGenAppliance adjusting fan speed...");
    }

    @Override
    public void draw() {
        System.out.println("NextGenAppliance drawing...");
    }

    @Override
    public void browseWeb() {
        System.out.println("NextGenAppliance browsing the web...");
    }

    @Override
    public void watchVideo() {
        System.out.println("NextGenAppliance watching video...");
    }
}
