package com.xworkz.inheritance.external;

public class ListView extends Component {
    public ListView() {
        super();
        System.out.println("Running constructor of ListView class.");
    }
    @Override
    public void render(){
        System.out.println("running render in ListView");
    }
    public void resize(){
        System.out.println("running resize in ListView");
    }
    public void enable(){
        System.out.println("running enable in ListView");
    }
    public void disable(){
        System.out.println("running disable in ListView");
    }
    public void click(){
        System.out.println("running click in ListView");
    }
}

