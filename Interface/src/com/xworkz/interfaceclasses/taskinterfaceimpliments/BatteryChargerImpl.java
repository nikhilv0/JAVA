package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.BatteryCharger;

public class BatteryChargerImpl implements BatteryCharger {
    @Override
    public void startCharging() {
        System.out.println("Battery charging started.");
    }

    @Override
    public void stopCharging() {
        System.out.println("Battery charging stopped.");
    }

    @Override
    public void checkBatteryStatus() {
        System.out.println("Battery status is healthy.");
    }
}
