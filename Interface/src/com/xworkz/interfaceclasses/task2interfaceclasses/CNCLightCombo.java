package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.CNC_Machine;
import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartLight;

public class CNCLightCombo implements CNC_Machine, SmartLight {

    @Override
    public void startMachine() {
        System.out.println("CNC machine started...");
    }

    @Override
    public void stopMachine() {
        System.out.println("CNC machine stopped...");
    }

    @Override
    public void calibrate() {
        System.out.println("CNC machine calibrated...");
    }

    @Override
    public void turnOnLight() {
        System.out.println("Shop light turned on...");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Shop light turned off...");
    }

    @Override
    public void changeColor() {
        System.out.println("Shop light color changed...");
    }

    @Override
    public void display() {
        CNC_Machine.super.display();
    }
}
