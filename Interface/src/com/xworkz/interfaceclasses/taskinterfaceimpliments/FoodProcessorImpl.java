package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.FoodProcessor;

public class FoodProcessorImpl implements FoodProcessor {
    @Override
    public void chop() {
        System.out.println("Chopping food.");
    }

    @Override
    public void grind() {
        System.out.println("Grinding food.");
    }

    @Override
    public void slice() {
        System.out.println("Slicing food.");
    }

    @Override
    public void display() {
        FoodProcessor.super.display();
    }
}
