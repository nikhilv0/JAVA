package com.xworkz.inheritance.external;

public class ProgressBar extends Component {
    public ProgressBar() {
        super();
        System.out.println("Running constructor of ProgressBar class.");
    }
    @Override
    public void render(){
        System.out.println("running render in ProgressBar");
    }
    public void resize(){
        System.out.println("running resize in ProgressBar");
    }
    public void enable(){
        System.out.println("running enable in ProgressBar");
    }
    public void disable(){
        System.out.println("running disable in ProgressBar");
    }
    public void click(){
        System.out.println("running click in ProgressBar");
    }
}
