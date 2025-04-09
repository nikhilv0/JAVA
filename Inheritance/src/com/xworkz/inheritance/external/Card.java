package com.xworkz.inheritance.external;

public class Card extends Component {
    public Card() {
        super();
        System.out.println("Running constructor of Card class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Card");
    }
    public void resize(){
        System.out.println("running resize in Card");
    }
    public void enable(){
        System.out.println("running enable in Card");
    }
    public void disable(){
        System.out.println("running disable in Card");
    }
    public void click(){
        System.out.println("running click in Card");
    }
    public void delete(){
        System.out.println("running unoCard in Card");
    }
}
