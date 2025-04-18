package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class EverydayCompanion implements SmartPhone, Tablet, CoffeeMaker, CeilingFan, Printer {
    @Override
    public void makeCall() {
        System.out.println("EverydayCompanion making call...");
    }

    @Override
    public void sendText() {
        System.out.println("EverydayCompanion sending text...");
    }

    @Override
    public void openApp() {
        System.out.println("EverydayCompanion opening app...");
    }

    @Override
    public void display() {
        SmartPhone.super.display();
    }

    @Override
    public void draw() {
        System.out.println("EverydayCompanion drawing...");
    }

    @Override
    public void browseWeb() {
        System.out.println("EverydayCompanion browsing...");
    }

    @Override
    public void watchVideo() {
        System.out.println("EverydayCompanion watching video...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("EverydayCompanion brewing coffee...");
    }

    @Override
    public void cleanMachine() {
        System.out.println("EverydayCompanion cleaning machine...");
    }

    @Override
    public void turnOff() {
        System.out.println("EverydayCompanion turning off...");
    }

    @Override
    public void turnOnFan() {
        System.out.println("EverydayCompanion turning on fan...");
    }

    @Override
    public void turnOffFan() {
        System.out.println("EverydayCompanion turning off fan...");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("EverydayCompanion adjusting fan speed...");
    }

    @Override
    public void printDocument() {
        System.out.println("EverydayCompanion printing...");
    }

    @Override
    public void scanDocument() {
        System.out.println("EverydayCompanion scanning...");
    }

    @Override
    public void cancelJob() {
        System.out.println("EverydayCompanion cancelling job...");
    }
}
