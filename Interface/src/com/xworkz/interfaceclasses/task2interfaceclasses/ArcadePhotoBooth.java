package com.xworkz.interfaceclasses.task2interfaceclasses;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ArcadeMachine;
import com.xworkz.interfaceclasses.taskinterfaceclasses.Camera;

public class ArcadePhotoBooth implements Camera, ArcadeMachine {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo in arcade booth...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording short video...");
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting booth photo settings...");
    }

    @Override
    public void display() {
        Camera.super.display();
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted for photo session...");
    }

    @Override
    public void startGame() {
        System.out.println("Photo session started...");
    }

    @Override
    public void endGame() {
        System.out.println("Photo session ended...");
    }
}
