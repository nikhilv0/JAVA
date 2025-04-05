package com.xworkz.inheritance.external;

public class Grid extends Component {
    public Grid() {
        super();
        System.out.println("Running constructor of Grid class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Grid");
    }
    public void resize(){
        System.out.println("running resize in Grid");
    }
    public void enable(){
        System.out.println("running enable in Grid");
    }
    public void disable(){
        System.out.println("running disable in Grid");
    }
    public void click(){
        System.out.println("running click in Grid");
    }
}