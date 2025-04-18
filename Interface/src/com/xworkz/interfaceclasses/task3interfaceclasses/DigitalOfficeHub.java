package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class DigitalOfficeHub implements SmartPhone, Laptop, Tablet, Printer, CeilingFan {
    @Override
    public void makeCall() {
        System.out.println("DigitalOfficeHub making a call...");
    }

    @Override
    public void sendText() {
        System.out.println("DigitalOfficeHub sending a text...");
    }

    @Override
    public void openApp() {
        System.out.println("DigitalOfficeHub opening an app...");
    }

    @Override
    public void display() {
        SmartPhone.super.display();
    }

    @Override
    public void compileCode() {
        System.out.println("DigitalOfficeHub compiling code...");
    }

    @Override
    public void runApplication() {
        System.out.println("DigitalOfficeHub running an application...");
    }

    @Override
    public void shutDown() {
        System.out.println("DigitalOfficeHub shutting down...");
    }

    @Override
    public void draw() {
        System.out.println("DigitalOfficeHub drawing...");
    }

    @Override
    public void browseWeb() {
        System.out.println("DigitalOfficeHub browsing the web...");
    }

    @Override
    public void watchVideo() {
        System.out.println("DigitalOfficeHub watching a video...");
    }

    @Override
    public void printDocument() {
        System.out.println("DigitalOfficeHub printing a document...");
    }

    @Override
    public void scanDocument() {
        System.out.println("DigitalOfficeHub scanning a document...");
    }

    @Override
    public void cancelJob() {
        System.out.println("DigitalOfficeHub cancelling a print job...");
    }

    @Override
    public void turnOnFan() {
        System.out.println("DigitalOfficeHub turning on the fan...");
    }

    @Override
    public void turnOffFan() {
        System.out.println("DigitalOfficeHub turning off the fan...");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("DigitalOfficeHub adjusting fan speed...");
    }
}
