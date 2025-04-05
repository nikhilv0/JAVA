package com.xworkz.inheritance.external;

public class StatusBar extends Component {
    public StatusBar() {
        super();
        System.out.println("Running constructor of StatusBar class.");
    }
    @Override
    public void render(){
        System.out.println("running render in StatusBar");
    }
    public void resize(){
        System.out.println("running resize in StatusBar");
    }
    public void enable(){
        System.out.println("running enable in StatusBar");
    }
    public void disable(){
        System.out.println("running disable in StatusBar");
    }
    public void click(){
        System.out.println("running click in StatusBar");
    }
}
