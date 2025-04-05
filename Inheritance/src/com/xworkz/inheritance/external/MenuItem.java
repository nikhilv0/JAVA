package com.xworkz.inheritance.external;

public class MenuItem extends Component {
    public MenuItem() {
        super();
        System.out.println("Running constructor of MenuItem class.");
    }
    @Override
    public void render(){
        System.out.println("running render in MenuItem");
    }
    public void resize(){
        System.out.println("running resize in MenuItem");
    }
    public void enable(){
        System.out.println("running enable in MenuItem");
    }
    public void disable(){
        System.out.println("running disable in MenuItem");
    }
    public void click(){
        System.out.println("running click in MenuItem");
    }
}

