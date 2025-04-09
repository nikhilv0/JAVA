package com.xworkz.inheritance.external;

public class Panel extends Component {
    public Panel() {
        super();
        System.out.println("Running constructor of Panel class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Panel");
    }
    public void resize(){
        System.out.println("running resize in Panel");
    }
    public void enable(){
        System.out.println("running enable in Panel");
    }
    public void disable(){
        System.out.println("running disable in Panel");
    }
    public void click(){
        System.out.println("running click in Panel");
    }
    public void open(){
        System.out.println("running click in Panel");
    }
}
