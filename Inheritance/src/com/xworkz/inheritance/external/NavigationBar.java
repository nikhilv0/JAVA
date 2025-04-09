package com.xworkz.inheritance.external;

public class NavigationBar extends Component {
    public NavigationBar() {
        super();
        System.out.println("Running constructor of NavigationBar class.");
    }
    @Override
    public void render(){
        System.out.println("running render in NavigationBar");
    }
    public void resize(){
        System.out.println("running resize in NavigationBar");
    }
    public void enable(){
        System.out.println("running enable in NavigationBar");
    }
    public void disable(){
        System.out.println("running disable in NavigationBar");
    }
    public void nav(){
        System.out.println("running nav in NavigationBar");
    }
}
