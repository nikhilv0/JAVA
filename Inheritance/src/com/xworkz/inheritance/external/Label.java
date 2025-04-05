package com.xworkz.inheritance.external;

public class Label extends Component {
    public Label() {
        super();
        System.out.println("Running constructor of Label class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Label");
    }
    public void resize(){
        System.out.println("running resize in Label");
    }
    public void enable(){
        System.out.println("running enable in Label");
    }
    public void disable(){
        System.out.println("running disable in Label");
    }
    public void click(){
        System.out.println("running click in Label");
    }
}
