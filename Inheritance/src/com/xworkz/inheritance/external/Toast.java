package com.xworkz.inheritance.external;

public class Toast extends Component {
    public Toast() {
        super();
        System.out.println("Running constructor of Toast class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Toast");
    }
    public void resize(){
        System.out.println("running resize in Toast");
    }
    public void enable(){
        System.out.println("running enable in Toast");
    }
    public void disable(){
        System.out.println("running disable in Toast");
    }
    public void click(){
        System.out.println("running click in Toast");
    }
}
