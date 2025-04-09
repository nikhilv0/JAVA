package com.xworkz.inheritance.external;

public class Tab extends Component {
    public Tab() {
        super();
        System.out.println("Running constructor of Tab class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Tab");
    }
    public void resize(){
        System.out.println("running resize in TabTab");
    }
    public void enable(){
        System.out.println("running enable in Tab");
    }
    public void disable(){
        System.out.println("running disable in Tab");
    }
    public void click(){
        System.out.println("running click in Tab");
    }
    public void tap(){
        System.out.println("running click in Tab");
    }
}
