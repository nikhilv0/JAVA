package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class TechCompanion implements SmartPhone, Tablet, Laptop, DesktopComputer, CoffeeMaker {
    @Override
    public void makeCall() {
        System.out.println("TechCompanion making a call...");
    }

    @Override
    public void sendText() {
        System.out.println("TechCompanion sending a text...");
    }

    @Override
    public void openApp() {
        System.out.println("TechCompanion opening an app...");
    }

    @Override
    public void display() {
        SmartPhone.super.display();
    }

    @Override
    public void draw() {
        System.out.println("TechCompanion drawing...");
    }

    @Override
    public void browseWeb() {
        System.out.println("TechCompanion browsing the web...");
    }

    @Override
    public void watchVideo() {
        System.out.println("TechCompanion watching a video...");
    }

    @Override
    public void compileCode() {
        System.out.println("TechCompanion compiling code...");
    }

    @Override
    public void runApplication() {
        System.out.println("TechCompanion running an application...");
    }

    @Override
    public void shutDown() {
        System.out.println("TechCompanion shutting down...");
    }

    @Override
    public void powerOn() {
        System.out.println("TechCompanion powering on...");
    }

    @Override
    public void runDiagnostics() {
        System.out.println("TechCompanion running diagnostics...");
    }

    @Override
    public void powerOff() {
        System.out.println("TechCompanion powering off...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("TechCompanion brewing coffee...");
    }

    @Override
    public void cleanMachine() {
        System.out.println("TechCompanion cleaning coffee machine...");
    }

    @Override
    public void turnOff() {
        System.out.println("TechCompanion turning off coffee machine...");
    }
}
