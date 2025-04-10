package com.xworkz.object.toString.internal;

public class GameConsole {
    private String brand, generation;
    private int storage;
    public GameConsole(String brand, String generation, int storage) {
        this.brand = brand;
        this.generation = generation;
        this.storage = storage;
    }
    @Override
    public String toString() {
        return "GameConsole {Brand:" + this.brand + " Generation:" + this.generation + " Storage:" + this.storage + "}";
    }
    @Override
    public int hashCode() {
        return 63;
    }
}
