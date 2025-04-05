package com.xworkz.inheritance.external;

public class RadioButton extends Component {
    public RadioButton() {
        super();
        System.out.println("Running constructor of RadioButton class.");
    }
    @Override
    public void render(){
        System.out.println("running render in RadioButton");
    }
    public void resize(){
        System.out.println("running resize in RadioButton");
    }
    public void enable(){
        System.out.println("running enable in RadioButton");
    }
    public void disable(){
        System.out.println("running disable in RadioButton");
    }
    public void click(){
        System.out.println("running click in RadioButton");
    }
}
