package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Dishwasher;

public class DishwasherImpl implements Dishwasher {
    @Override
    public void startWashing() {
        System.out.println("Dishwasher washing started.");
    }

    @Override
    public void stopWashing() {
        System.out.println("Dishwasher washing stopped.");
    }

    @Override
    public void dryDishes() {
        System.out.println("Drying dishes in the dishwasher.");
    }

    @Override
    public void display() {
        Dishwasher.super.display();
    }
}
