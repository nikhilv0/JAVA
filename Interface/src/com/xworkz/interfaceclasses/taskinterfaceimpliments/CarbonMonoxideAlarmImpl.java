package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.CarbonMonoxideAlarm;

public class CarbonMonoxideAlarmImpl implements CarbonMonoxideAlarm {
    @Override
    public void detectGas() {
        System.out.println("Carbon monoxide detected in the air.");
    }

    @Override
    public void alert() {
        System.out.println("Carbon monoxide alert triggered!");
    }

    @Override
    public void resetAlarm() {
        System.out.println("Carbon monoxide alarm has been reset.");
    }
}
