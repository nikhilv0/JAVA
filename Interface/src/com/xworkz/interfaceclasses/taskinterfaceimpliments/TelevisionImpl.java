package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Television;

public class TelevisionImpl implements Television {
    @Override
    public void powerOn() {
        System.out.println("Television powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Television powered off.");
    }

    @Override
    public void changeChannel() {
        System.out.println("Changing television channel.");
    }

    @Override
    public void display() {
        Television.super.display();
    }
}
