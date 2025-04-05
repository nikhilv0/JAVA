package com.xworkz.inheritance.external;

public class Dropdown extends Component {
    public Dropdown() {
        super();
        System.out.println("Running constructor of Dropdown class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Dropdown");
    }
    public void resize(){
        System.out.println("running resize in Dropdown");
    }
    public void enable(){
        System.out.println("running enable in Dropdown");
    }
    public void disable(){
        System.out.println("running disable in Dropdown");
    }
    public void click(){
        System.out.println("running click in Dropdown");
    }
}