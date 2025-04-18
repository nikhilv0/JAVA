package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class ProductivityHub implements Laptop, DesktopComputer, Printer, Tablet, CeilingFan {
    @Override
    public void compileCode() {
        System.out.println("Compiling code on ProductivityHub...");
    }

    @Override
    public void runApplication() {
        System.out.println("Running application on ProductivityHub...");
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down ProductivityHub...");
    }

    @Override
    public void display() {
        Laptop.super.display();
    }

    @Override
    public void powerOn() {
        System.out.println("Powering on ProductivityHub...");
    }

    @Override
    public void runDiagnostics() {
        System.out.println("Running diagnostics on ProductivityHub...");
    }

    @Override
    public void powerOff() {
        System.out.println("Powering off ProductivityHub...");
    }

    @Override
    public void printDocument() {
        System.out.println("Printing document with ProductivityHub...");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning document with ProductivityHub...");
    }

    @Override
    public void cancelJob() {
        System.out.println("Cancelling print job in ProductivityHub...");
    }

    @Override
    public void draw() {
        System.out.println("Drawing using ProductivityHub...");
    }

    @Override
    public void browseWeb() {
        System.out.println("Browsing the web with ProductivityHub...");
    }

    @Override
    public void watchVideo() {
        System.out.println("Watching video on ProductivityHub...");
    }

    @Override
    public void turnOnFan() {
        System.out.println("Turning on fan with ProductivityHub...");
    }

    @Override
    public void turnOffFan() {
        System.out.println("Turning off fan with ProductivityHub...");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Adjusting fan speed with ProductivityHub...");
    }
}
