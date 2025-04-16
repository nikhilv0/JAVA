package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.FitnessTracker;

public class FitnessTrackerImpl implements FitnessTracker {
    @Override
    public void countSteps() {
        System.out.println("Counting steps.");
    }

    @Override
    public void monitorHeartRate() {
        System.out.println("Monitoring heart rate.");
    }

    @Override
    public void syncData() {
        System.out.println("Syncing data.");
    }
}
