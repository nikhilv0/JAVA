package com.xworkz.interfaceclasses.task3interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class ProGadgetX implements Laptop, Printer, DesktopComputer, WaterHeater, SmartWatch {
    @Override
    public void compileCode() {
        System.out.println("ProGadgetX compiling code...");
    }

    @Override
    public void runApplication() {
        System.out.println("ProGadgetX running app...");
    }

    @Override
    public void shutDown() {
        System.out.println("ProGadgetX shutting down...");
    }

    @Override
    public void display() {
        Laptop.super.display();
    }

    @Override
    public void printDocument() {
        System.out.println("ProGadgetX printing document...");
    }

    @Override
    public void scanDocument() {
        System.out.println("ProGadgetX scanning document...");
    }

    @Override
    public void cancelJob() {
        System.out.println("ProGadgetX cancelling job...");
    }

    @Override
    public void powerOn() {
        System.out.println("ProGadgetX powering on...");
    }

    @Override
    public void runDiagnostics() {
        System.out.println("ProGadgetX running diagnostics...");
    }

    @Override
    public void powerOff() {
        System.out.println("ProGadgetX powering off...");
    }

    @Override
    public void heatWater() {
        System.out.println("ProGadgetX heating water...");
    }

    @Override
    public void turnOffHeater() {
        System.out.println("ProGadgetX turning off heater...");
    }

    @Override
    public void setTemperature() {
        System.out.println("ProGadgetX setting temperature...");
    }

    @Override
    public void showTime() {
        System.out.println("ProGadgetX showing time...");
    }

    @Override
    public void trackSteps() {
        System.out.println("ProGadgetX tracking steps...");
    }

    @Override
    public void displayNotification() {
        System.out.println("ProGadgetX displaying notifications...");
    }
}
