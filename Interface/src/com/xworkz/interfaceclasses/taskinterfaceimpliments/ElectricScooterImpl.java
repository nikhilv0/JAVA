package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ElectricScooter;

public class ElectricScooterImpl implements ElectricScooter {
    @Override
    public void accelerate() {
        System.out.println("Electric scooter accelerating.");
    }

    @Override
    public void applyBrake() {
        System.out.println("Electric scooter braking.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging electric scooter.");
    }
}
