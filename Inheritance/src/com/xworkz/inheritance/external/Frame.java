package com.xworkz.inheritance.external;

public class Frame extends Component {
    public Frame() {
        super();
        System.out.println("Running constructor of Frame class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Frame");
    }
    public void resize(){
        System.out.println("running resize in Frame");
    }
    public void enable(){
        System.out.println("running enable in Frame");
    }
    public void disable(){
        System.out.println("running disable in Frame");
    }
    public void click(){
        System.out.println("running click in Frame");
    }
}
