package com.xworkz.inheritance.external;

public class Tooltip extends Component {
    public Tooltip() {
        super();
        System.out.println("Running constructor of Tooltip class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Tooltip");
    }
    public void resize(){
        System.out.println("running resize in Tooltip");
    }
    public void enable(){
        System.out.println("running enable in Tooltip");
    }
    public void disable(){
        System.out.println("running disable in Tooltip");
    }
    public void click(){
        System.out.println("running click in Tooltip");
    }
}
