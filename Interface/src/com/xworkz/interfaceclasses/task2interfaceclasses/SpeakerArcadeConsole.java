package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ArcadeMachine;
import com.xworkz.interfaceclasses.taskinterfaceclasses.Speaker;

public class SpeakerArcadeConsole implements Speaker, ArcadeMachine {

    @Override
    public void playSound() {
        System.out.println("Playing arcade game sound...");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Turning up arcade volume...");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Turning down arcade volume...");
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted...");
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
        Speaker.super.display();
    }
}
