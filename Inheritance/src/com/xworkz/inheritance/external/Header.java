package com.xworkz.inheritance.external;

public class Header extends Component {
    public Header() {
        super();
        System.out.println("Running constructor of Header class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Header");
    }
    public void resize(){
        System.out.println("running resize in Header");
    }
    public void enable(){
        System.out.println("running enable in Header");
    }
    public void disable(){
        System.out.println("running disable in Header");
    }
    public void click(){
        System.out.println("running click in Header");
    }
}
