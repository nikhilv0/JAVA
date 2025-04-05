package com.xworkz.inheritance.external;

public class Canvas extends Component {
    public Canvas() {
        super();
        System.out.println("Running constructor of Canvas class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Canvas");
    }
    public void resize(){
        System.out.println("running resize in Canvas");
    }
    public void enable(){
        System.out.println("running enable in Canvas");
    }
    public void disable(){
        System.out.println("running disable in Canvas");
    }
    public void click(){
        System.out.println("running click in Canvas");
    }
}
