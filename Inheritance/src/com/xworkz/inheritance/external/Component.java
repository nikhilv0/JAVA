package com.xworkz.inheritance.external;

public class Component {
    public Component(){

        System.out.println("running constructor Component");
    }
    public void render(){
        System.out.println("running render in Component");
    }
    public void resize(){
        System.out.println("running resize in Component");
    }
    public void enable(){
        System.out.println("running enable in Component");
    }
    public void disable(){
        System.out.println("running disable in Component");
    }
    public void click(){
        System.out.println("running click in Component");
    }
}
