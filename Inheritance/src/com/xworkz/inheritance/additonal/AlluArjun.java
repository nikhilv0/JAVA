package com.xworkz.inheritance.additonal;

public class AlluArjun extends Model {
    public AlluArjun() {
        super();
        System.out.println("Running constructor of AlluArjun class");
    }
    @Override
    public void walk() {
        System.out.println("Running walk in AlluArjun class");
    }

    public void pose() {
        System.out.println("Posing in AlluArjun class");
    }

    public void design() {
        System.out.println("design in AlluArjun class");
    }

    public void dance() {
        System.out.println("dancing in AlluArjun class");
    }

    public void display() {
        System.out.println("Displaying in AlluArjun class");
    }
}
