package com.xworkz.inheritance.external;

public class Button extends Component{
    public Button(){
        super();
        System.out.println("running constructor of Button class");
    }
    @Override
    public void render(){
        System.out.println("running render in Button");
    }
    public void resize(){
        System.out.println("running resize in Button");
    }
    public void enable(){
        System.out.println("running enable in Button");
    }
    public void disable(){
        System.out.println("running disable in Button");
    }
    public void click(){
        System.out.println("running click in Button");
    }
}
