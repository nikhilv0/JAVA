package com.xworkz.inheritance.external;

public class TextField extends Component {
    public TextField() {
        super();
        System.out.println("Running constructor of TextField class.");
    }
    @Override
    public void render(){
        System.out.println("running render in TextField");
    }
    public void resize(){
        System.out.println("running resize in TextField");
    }
    public void enable(){
        System.out.println("running enable in TextField");
    }
    public void disable(){
        System.out.println("running disable in TextField");
    }
    public void click(){
        System.out.println("running click in TextField");
    }
}
