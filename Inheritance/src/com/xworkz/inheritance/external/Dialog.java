package com.xworkz.inheritance.external;

public class Dialog extends Component {
    public Dialog() {
        super();
        System.out.println("Running constructor of Dialog class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Dialog");
    }
    public void resize(){
        System.out.println("running resize in Dialog");
    }
    public void enable(){
        System.out.println("running enable in Dialog");
    }
    public void disable(){
        System.out.println("running disable in Dialog");
    }
    public void click(){
        System.out.println("running click in Dialog");
    }
}
