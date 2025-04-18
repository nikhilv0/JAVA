package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.CNC_Machine;

public class CNC_MachineImpl implements CNC_Machine {
    @Override
    public void startMachine() {
        System.out.println("CNC Machine started.");
    }

    @Override
    public void stopMachine() {
        System.out.println("CNC Machine stopped.");
    }

    @Override
    public void calibrate() {
        System.out.println("Calibrating CNC Machine.");
    }

    @Override
    public void display() {
        CNC_Machine.super.display();
    }
}
