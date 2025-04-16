package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartPhone;

public class SmartPhoneImpl implements SmartPhone {
    @Override
    public void makeCall() {
        System.out.println("Making a call.");
    }

    @Override
    public void sendText() {
        System.out.println("Sending a text message.");
    }

    @Override
    public void openApp() {
        System.out.println("Opening an app.");
    }
}
