package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.PetFeeder;

public class PetFeederImpl implements PetFeeder {
    @Override
    public void dispenseFood() {
        System.out.println("Dispensing food to pet.");
    }

    @Override
    public void setFeedingSchedule() {
        System.out.println("Setting feeding schedule.");
    }

    @Override
    public void checkFoodLevel() {
        System.out.println("Checking food level.");
    }
}
