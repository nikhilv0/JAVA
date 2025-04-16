package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.MotionSensor;

public class MotionSensorImpl implements MotionSensor {
    @Override
    public void detectMovement() {
        System.out.println("Motion detected in the area.");
    }

    @Override
    public void sendSignal() {
        System.out.println("Signal sent to security system.");
    }

    @Override
    public void calibrateSensor() {
        System.out.println("Motion sensor calibrated successfully.");
    }
}
