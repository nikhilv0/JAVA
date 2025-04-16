package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.AutomaticSoapDispenser;

public class AutomaticSoapDispenserImpl implements AutomaticSoapDispenser {
    @Override
    public void dispenseSoap() {
        System.out.println("Soap dispensed automatically.");
    }

    @Override
    public void refillSoap() {
        System.out.println("Soap refilled in dispenser.");
    }

    @Override
    public void cleanNozzle() {
        System.out.println("Nozzle cleaned for hygiene.");
    }
}
