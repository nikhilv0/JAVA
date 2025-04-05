package com.xworkz.inheritance.external;

public class Spinner extends Component {
    public Spinner() {
        super();
        System.out.println("Running constructor of Spinner class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Spinner");
    }
    public void resize(){
        System.out.println("running resize in Spinner");
    }
    public void enable(){
        System.out.println("running enable in Spinner");
    }
    public void disable(){
        System.out.println("running disable in Spinner");
    }
    public void click(){
        System.out.println("running click in Spinner");
    }
}
