package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Printer;

public class PrinterImpl implements Printer {
    @Override
    public void printDocument() {
        System.out.println("Printing document.");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning document.");
    }

    @Override
    public void cancelJob() {
        System.out.println("Cancelling print job.");
    }

    @Override
    public void display() {
        Printer.super.display();
    }
}
