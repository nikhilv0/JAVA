package com.xworkz.inheritance.external;

public class Toolbar extends Component {
    public Toolbar() {
        super();
        System.out.println("Running constructor of Toolbar class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Toolbar");
    }
    public void resize(){
        System.out.println("running resize in Toolbar");
    }
    public void enable(){
        System.out.println("running enable in Toolbar");
    }
    public void disable(){
        System.out.println("running disable in Toolbar");
    }
    public void click(){
        System.out.println("running click in Toolbar");
    }
}

