package com.xworkz.inheritance.external;

public class Slider extends Component {
    public Slider() {
        super();
        System.out.println("Running constructor of Slider class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Slider");
    }
    public void resize(){
        System.out.println("running resize in Slider");
    }
    public void enable(){
        System.out.println("running enable in Slider");
    }
    public void disable(){
        System.out.println("running disable in Slider");
    }
    public void click(){
        System.out.println("running click in Slider");
    }
}
