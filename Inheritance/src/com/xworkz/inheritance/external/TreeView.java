package com.xworkz.inheritance.external;

public class TreeView extends Component {
    public TreeView() {
        super();
        System.out.println("Running constructor of TreeView class.");
    }
    @Override
    public void render(){
        System.out.println("running render in TreeView");
    }
    public void resize(){
        System.out.println("running resize in TreeView");
    }
    public void enable(){
        System.out.println("running enable in TreeView");
    }
    public void disable(){
        System.out.println("running disable in TreeView");
    }
    public void click(){
        System.out.println("running click in TreeView");
    }
}
