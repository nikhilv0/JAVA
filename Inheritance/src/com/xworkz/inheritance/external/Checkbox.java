package com.xworkz.inheritance.external;

public class Checkbox extends Component {
    public Checkbox() {
        super();
        System.out.println("Running constructor of Checkbox class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Checkbox");
    }
    public void resize(){
        System.out.println("running resize in Checkbox");
    }
    public void enable(){
        System.out.println("running enable in Checkbox");
    }
    public void disable(){
        System.out.println("running disable in Checkbox");
    }
    public void click(){
        System.out.println("running click in Checkbox");
    }
}
