package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class ModernTechCombo implements Tablet, Laptop, DesktopComputer, SmartPhone, CoffeeMaker {
    @Override
    public void draw() {
        System.out.println("ModernTechCombo drawing...");
    }

    @Override
    public void browseWeb() {
        System.out.println("ModernTechCombo browsing the web...");
    }

    @Override
    public void watchVideo() {
        System.out.println("ModernTechCombo watching video...");
    }

    @Override
    public void compileCode() {
        System.out.println("ModernTechCombo compiling code...");
    }

    @Override
    public void runApplication() {
        System.out.println("ModernTechCombo running application...");
    }

    @Override
    public void shutDown() {
        System.out.println("ModernTechCombo shutting down...");
    }

    @Override
    public void powerOn() {
        System.out.println("ModernTechCombo powering on...");
    }

    @Override
    public void runDiagnostics() {
        System.out.println("ModernTechCombo running diagnostics...");
    }

    @Override
    public void powerOff() {
        System.out.println("ModernTechCombo powering off...");
    }

    @Override
    public void makeCall() {
        System.out.println("ModernTechCombo making a call...");
    }

    @Override
    public void sendText() {
        System.out.println("ModernTechCombo sending a text...");
    }

    @Override
    public void openApp() {
        System.out.println("ModernTechCombo opening an app...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("ModernTechCombo brewing coffee...");
    }

    @Override
    public void cleanMachine() {
        System.out.println("ModernTechCombo cleaning coffee machine...");
    }

    @Override
    public void turnOff() {
        System.out.println("ModernTechCombo turning off coffee machine...");
    }
}
