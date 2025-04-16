package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Laptop;

public class LaptopImpl implements Laptop {
    @Override
    public void compileCode() {
        System.out.println("Compiling code on laptop.");
    }

    @Override
    public void runApplication() {
        System.out.println("Running application on laptop.");
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down laptop.");
    }
}
