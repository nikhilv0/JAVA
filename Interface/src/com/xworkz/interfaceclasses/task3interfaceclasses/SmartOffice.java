package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class SmartOffice implements Printer, Laptop, CoffeeMaker, VacuumCleaner, SmartWatch {
    @Override
    public void printDocument() {
        System.out.println("SmartOfficeDevice printing a document...");
    }

    @Override
    public void scanDocument() {
        System.out.println("SmartOfficeDevice scanning a document...");
    }

    @Override
    public void cancelJob() {
        System.out.println("SmartOfficeDevice cancelling print job...");
    }

    @Override
    public void display() {
        Printer.super.display();
    }

    @Override
    public void compileCode() {
        System.out.println("SmartOfficeDevice compiling code...");
    }

    @Override
    public void runApplication() {
        System.out.println("SmartOfficeDevice running an application...");
    }

    @Override
    public void shutDown() {
        System.out.println("SmartOfficeDevice shutting down...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("SmartOfficeDevice brewing coffee...");
    }

    @Override
    public void cleanMachine() {
        System.out.println("SmartOfficeDevice cleaning the coffee maker...");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartOfficeDevice turning off coffee maker...");
    }

    @Override
    public void startCleaning() {
        System.out.println("SmartOfficeDevice starting vacuum cleaning...");
    }

    @Override
    public void stopCleaning() {
        System.out.println("SmartOfficeDevice stopping vacuum cleaning...");
    }

    @Override
    public void emptyDustBag() {
        System.out.println("SmartOfficeDevice emptying vacuum dust bag...");
    }

    @Override
    public void showTime() {
        System.out.println("SmartOfficeDevice showing time...");
    }

    @Override
    public void trackSteps() {
        System.out.println("SmartOfficeDevice tracking steps...");
    }

    @Override
    public void displayNotification() {
        System.out.println("SmartOfficeDevice displaying notifications...");
    }
}
