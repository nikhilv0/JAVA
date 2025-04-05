package com.xworkz.inheritance.additonal;

public class Sanjana extends Model{
    public Sanjana(){
        super();
        System.out.println("Running constructor of Sanjana");
    }
    @Override
    public void walk() {
        System.out.println("Running walk in Sanjana class");
    }

    public void pose() {
        System.out.println("Posing in Sanjana class");
    }

    public void design() {
        System.out.println("design in Sanjana class");
    }

    public void dance() {
        System.out.println("dancing in Sanjana class");
    }

    public void display() {
        System.out.println("Displaying in Sanjana class");
    }
}
