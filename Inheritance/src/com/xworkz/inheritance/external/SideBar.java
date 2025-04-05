package com.xworkz.inheritance.external;

public class SideBar extends Component {
    public SideBar() {
        super();
        System.out.println("Running constructor of Sidebar class.");
    }
    @Override
    public void render(){
        System.out.println("running render in SideBar");
    }
    public void resize(){
        System.out.println("running resize in SideBar");
    }
    public void enable(){
        System.out.println("running enable in SideBar");
    }
    public void disable(){
        System.out.println("running disable in SideBar");
    }
    public void click(){
        System.out.println("running click in SideBar");
    }
}
