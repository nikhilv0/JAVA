package com.xworkz.inheritance.external;

public class Footer extends Component {
    public Footer() {
        super();
        System.out.println("Running constructor of Footer class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Footer");
    }
    public void resize(){
        System.out.println("running resize in Footer");
    }
    public void enable(){
        System.out.println("running enable in Footer");
    }
    public void disable(){
        System.out.println("running disable in Footer");
    }
    public void click(){
        System.out.println("running click in Footer");
    }
}
