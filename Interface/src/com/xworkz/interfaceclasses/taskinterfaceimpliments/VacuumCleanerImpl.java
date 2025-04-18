package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.VacuumCleaner;

public class VacuumCleanerImpl implements VacuumCleaner {
    @Override
    public void startCleaning() {
        System.out.println("Vacuum cleaner started cleaning.");
    }

    @Override
    public void stopCleaning() {
        System.out.println("Vacuum cleaner stopped cleaning.");
    }

    @Override
    public void emptyDustBag() {
        System.out.println("Vacuum cleaner dust bag emptied.");
    }

    @Override
    public void display() {
        VacuumCleaner.super.display();
    }
}
