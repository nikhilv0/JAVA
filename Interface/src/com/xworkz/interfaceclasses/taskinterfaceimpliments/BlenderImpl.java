package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.Blender;

public class BlenderImpl implements Blender {
    @Override
    public void startBlending() {
        System.out.println("Blender started.");
    }

    @Override
    public void stopBlending() {
        System.out.println("Blender stopped.");
    }

    @Override
    public void pulseBlend() {
        System.out.println("Pulse blending.");
    }

    @Override
    public void display() {
        Blender.super.display();
    }
}
