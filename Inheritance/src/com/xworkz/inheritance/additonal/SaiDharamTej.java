package com.xworkz.inheritance.additonal;

public class SaiDharamTej extends Model {
    public SaiDharamTej() {
        super();
        System.out.println("Running constructor of SaiDharamTej class");
    }
    @Override
    public void walk() {
        System.out.println("Running walk in SaiDharamTej class");
    }

    public void pose() {
        System.out.println("Posing in SaiDharamTej class");
    }

    public void design() {
        System.out.println("design in SaiDharamTej class");
    }

    public void dance() {
        System.out.println("dancing in SaiDharamTej class");
    }

    public void display() {
        System.out.println("Displaying in SaiDharamTej class");
    }
    public void sai() {
        System.out.println("Sai tej in PawanKalyan class");
    }
}
