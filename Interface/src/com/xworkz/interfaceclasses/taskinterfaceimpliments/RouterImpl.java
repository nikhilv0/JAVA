package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Router;

public class RouterImpl implements Router {
    @Override
    public void connectToInternet() {
        System.out.println("Router is connected to the internet.");
    }

    @Override
    public void resetRouter() {
        System.out.println("Router is resetting.");
    }

    @Override
    public void updateFirmware() {
        System.out.println("Router firmware is being updated.");
    }
}
