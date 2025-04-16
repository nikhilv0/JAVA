package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.CNC_Machine;
import com.xworkz.interfaceclasses.taskinterfaceclasses.Speaker;

public class CNCMusicBot implements CNC_Machine, Speaker {

    @Override
    public void startMachine() {
        System.out.println("CNC machine started cutting...");
    }

    @Override
    public void stopMachine() {
        System.out.println("CNC machine stopped...");
    }

    @Override
    public void calibrate() {
        System.out.println("Calibrating CNC machine...");
    }

    @Override
    public void playSound() {
        System.out.println("Speaker playing CNC operation sounds...");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing CNC sound volume...");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Decreasing CNC sound volume...");
    }
}
