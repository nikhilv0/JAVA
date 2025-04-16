package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.DesktopComputer;

public class DesktopComputerImpl implements DesktopComputer {
    @Override
    public void powerOn() {
        System.out.println("Desktop computer powered on.");
    }

    @Override
    public void runDiagnostics() {
        System.out.println("Running diagnostics on desktop computer.");
    }

    @Override
    public void powerOff() {
        System.out.println("Desktop computer powered off.");
    }
}
