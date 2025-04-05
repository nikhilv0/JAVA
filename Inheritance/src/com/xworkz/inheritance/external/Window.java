package com.xworkz.inheritance.external;

public class Window extends Component {
    public Window() {
        super();
        System.out.println("Running constructor of Window class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Window");
    }
    public void resize(){
        System.out.println("running resize in Window");
    }
    public void enable(){
        System.out.println("running enable in Window");
    }
    public void disable(){
        System.out.println("running disable in Window");
    }
    public void click(){
        System.out.println("running click in Window");
    }
}
