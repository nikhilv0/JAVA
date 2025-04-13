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
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof GameConsole){
                GameConsole console=this;
                GameConsole console2=(GameConsole) obj;
                if (console.brand.equals(console2.brand) && console.generation.equals(console2.generation)){
                    return true;
                }
            }
        }
        return false;
    }
}
