package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class HybridWorkStation implements DesktopComputer, Printer, Tablet, CoffeeMaker, CeilingFan {
    @Override
    public void powerOn() {
        System.out.println("HybridWorkStation powering on...");
    }

    @Override
    public void runDiagnostics() {
        System.out.println("HybridWorkStation running diagnostics...");
    }

    @Override
    public void powerOff() {
        System.out.println("HybridWorkStation powering off...");
    }

    @Override
    public void printDocument() {
        System.out.println("HybridWorkStation printing document...");
    }

    @Override
    public void scanDocument() {
        System.out.println("HybridWorkStation scanning document...");
    }

    @Override
    public void cancelJob() {
        System.out.println("HybridWorkStation cancelling job...");
    }

    @Override
    public void draw() {
        System.out.println("HybridWorkStation drawing...");
    }

    @Override
    public void browseWeb() {
        System.out.println("HybridWorkStation browsing web...");
    }

    @Override
    public void watchVideo() {
        System.out.println("HybridWorkStation watching video...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("HybridWorkStation brewing coffee...");
    }

    @Override
    public void cleanMachine() {
        System.out.println("HybridWorkStation cleaning coffee maker...");
    }

    @Override
    public void turnOff() {
        System.out.println("HybridWorkStation turning off coffee maker...");
    }

    @Override
    public void turnOnFan() {
        System.out.println("HybridWorkStation turning on fan...");
    }

    @Override
    public void turnOffFan() {
        System.out.println("HybridWorkStation turning off fan...");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("HybridWorkStation adjusting fan speed...");
    }
}
