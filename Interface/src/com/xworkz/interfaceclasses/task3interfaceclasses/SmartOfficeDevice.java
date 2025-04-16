package com.xworkz.interfaceclasses.task3interfaceclasses;
import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class SmartOfficeDevice implements Laptop, DesktopComputer, Printer, SmartWatch, CoffeeMaker {
    @Override
    public void compileCode() {
        System.out.println("Compiling code on SmartOfficeDevice...");
    }

    @Override
    public void runApplication() {
        System.out.println("Running app on SmartOfficeDevice...");
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down SmartOfficeDevice...");
    }

    @Override
    public void powerOn() {
        System.out.println("Powering on SmartOfficeDevice...");
    }

    @Override
    public void runDiagnostics() {
        System.out.println("Running diagnostics on SmartOfficeDevice...");
    }

    @Override
    public void powerOff() {
        System.out.println("Powering off SmartOfficeDevice...");
    }

    @Override
    public void printDocument() {
        System.out.println("Printing document from SmartOfficeDevice...");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning document with SmartOfficeDevice...");
    }

    @Override
    public void cancelJob() {
        System.out.println("Cancelling print job on SmartOfficeDevice...");
    }

    @Override
    public void showTime() {
        System.out.println("Showing time on SmartOfficeDevice...");
    }

    @Override
    public void trackSteps() {
        System.out.println("Tracking steps with SmartOfficeDevice...");
    }

    @Override
    public void displayNotification() {
        System.out.println("Displaying notifications on SmartOfficeDevice...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("Brewing coffee on SmartOfficeDevice...");
    }

    @Override
    public void cleanMachine() {
        System.out.println("Cleaning coffee machine in SmartOfficeDevice...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off coffee module in SmartOfficeDevice...");
    }
}



