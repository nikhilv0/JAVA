package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ArcadeMachine;
import com.xworkz.interfaceclasses.taskinterfaceclasses.SmartLight;

public class LightArcadeCombo implements SmartLight, ArcadeMachine {

    @Override
    public void turnOnLight() {
        System.out.println("Arcade light on...");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Arcade light off...");
    }

    @Override
    public void changeColor() {
        System.out.println("Arcade light color changed...");
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted into arcade...");
    }

    @Override
    public void startGame() {
        System.out.println("Arcade game started...");
    }

    @Override
    public void endGame() {
        System.out.println("Arcade game ended...");
    }

    @Override
    public void display() {
        SmartLight.super.display();
    }
}
