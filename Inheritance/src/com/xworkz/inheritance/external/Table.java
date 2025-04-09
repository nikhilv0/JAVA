package com.xworkz.inheritance.external;

public class Table extends Component {
    public Table() {
        super();
        System.out.println("Running constructor of Table class.");
    }
    @Override
    public void render(){
        System.out.println("running render in Table");
    }
    public void resize(){
        System.out.println("running resize in Table");
    }
    public void enable(){
        System.out.println("running enable in Table");
    }
    public void disable(){
        System.out.println("running disable in Table");
    }
    public void click(){
        System.out.println("running click in Table");
    }
    public void add(){
        System.out.println("running click in Table");
    }
}

