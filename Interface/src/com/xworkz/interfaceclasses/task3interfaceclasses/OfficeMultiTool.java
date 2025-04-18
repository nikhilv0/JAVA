package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class OfficeMultiTool implements DesktopComputer, Printer, Tablet, SmartPhone, CoffeeMaker {
    @Override
    public void powerOn() {
        System.out.println("OfficeMultiTool powering on...");
    }

    @Override
    public void runDiagnostics() {
        System.out.println("OfficeMultiTool running diagnostics...");
    }

    @Override
    public void powerOff() {
        System.out.println("OfficeMultiTool powering off...");
    }

    @Override
    public void display() {
        DesktopComputer.super.display();
    }

    @Override
    public void printDocument() {
        System.out.println("OfficeMultiTool printing document...");
    }

    @Override
    public void scanDocument() {
        System.out.println("OfficeMultiTool scanning document...");
    }

    @Override
    public void cancelJob() {
        System.out.println("OfficeMultiTool cancelling job...");
    }

    @Override
    public void draw() {
        System.out.println("OfficeMultiTool drawing...");
    }

    @Override
    public void browseWeb() {
        System.out.println("OfficeMultiTool browsing the web...");
    }

    @Override
    public void watchVideo() {
        System.out.println("OfficeMultiTool watching video...");
    }

    @Override
    public void makeCall() {
        System.out.println("OfficeMultiTool making call...");
    }

    @Override
    public void sendText() {
        System.out.println("OfficeMultiTool sending text...");
    }

    @Override
    public void openApp() {
        System.out.println("OfficeMultiTool opening app...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("OfficeMultiTool brewing coffee...");
    }

    @Override
    public void cleanMachine() {
        System.out.println("OfficeMultiTool cleaning machine...");
    }

    @Override
    public void turnOff() {
        System.out.println("OfficeMultiTool turning off...");
    }
}
