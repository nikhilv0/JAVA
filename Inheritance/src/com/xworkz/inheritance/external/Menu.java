package com.xworkz.inheritance.external;

public class Menu extends Component {
    public Menu() {
        super();
        System.out.println("Running constructor of Menu class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Menu");
    }
    public void resize(){
        System.out.println("running resize in Menu");
    }
    public void enable(){
        System.out.println("running enable in Menu");
    }
    public void disable(){
        System.out.println("running disable in Menu");
    }
    public void click(){
        System.out.println("running click in Menu");
    }
}

