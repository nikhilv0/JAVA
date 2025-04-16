package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class HybridOfficeGadget implements DesktopComputer, Tablet, SmartPhone, Printer, SmartWatch {
    @Override
    public void powerOn() {
        System.out.println("HybridOfficeGadget powering on...");
    }

    @Override
    public void runDiagnostics() {
        System.out.println("HybridOfficeGadget running diagnostics...");
    }

    @Override
    public void powerOff() {
        System.out.println("HybridOfficeGadget powering off...");
    }

    @Override
    public void draw() {
        System.out.println("HybridOfficeGadget drawing...");
    }

    @Override
    public void browseWeb() {
        System.out.println("HybridOfficeGadget browsing web...");
    }

    @Override
    public void watchVideo() {
        System.out.println("HybridOfficeGadget watching video...");
    }

    @Override
    public void makeCall() {
        System.out.println("HybridOfficeGadget making a call...");
    }

    @Override
    public void sendText() {
        System.out.println("HybridOfficeGadget sending a text...");
    }

    @Override
    public void openApp() {
        System.out.println("HybridOfficeGadget opening app...");
    }

    @Override
    public void printDocument() {
        System.out.println("HybridOfficeGadget printing...");
    }

    @Override
    public void scanDocument() {
        System.out.println("HybridOfficeGadget scanning...");
    }

    @Override
    public void cancelJob() {
        System.out.println("HybridOfficeGadget cancelling job...");
    }

    @Override
    public void showTime() {
        System.out.println("HybridOfficeGadget showing time...");
    }

    @Override
    public void trackSteps() {
        System.out.println("HybridOfficeGadget tracking steps...");
    }

    @Override
    public void displayNotification() {
        System.out.println("HybridOfficeGadget displaying notification...");
    }
}
