package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Juicer;

public class JuicerImpl implements Juicer {
    @Override
    public void extractJuice() {
        System.out.println("Extracting juice.");
    }

    @Override
    public void cleanJuicer() {
        System.out.println("Cleaning juicer.");
    }

    @Override
    public void stopJuicer() {
        System.out.println("Stopping juicer.");
    }

    @Override
    public void display() {
        Juicer.super.display();
    }
}
