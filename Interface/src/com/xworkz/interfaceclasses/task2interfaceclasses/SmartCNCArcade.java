package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ArcadeMachine;
import com.xworkz.interfaceclasses.taskinterfaceclasses.CNC_Machine;

public class SmartCNCArcade implements CNC_Machine, ArcadeMachine {

    @Override
    public void startMachine() {
        System.out.println("Starting CNC machine...");
    }

    @Override
    public void stopMachine() {
        System.out.println("Stopping CNC machine...");
    }

    @Override
    public void calibrate() {
        System.out.println("Calibrating CNC machine...");
    }

    @Override
    public void insertCoin() {
        System.out.println("Inserting coin into arcade...");
    }

    @Override
    public void startGame() {
        System.out.println("Starting arcade game...");
    }

    @Override
    public void endGame() {
        System.out.println("Ending arcade game...");
    }
}
