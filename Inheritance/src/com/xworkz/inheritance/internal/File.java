package com.xworkz.inheritance.internal;

public class File extends Resource {
        public File(){
            super();
            System.out.println("Running cont file");
        }
        @Override
        public void load(){
            System.out.println("running load in File");
        }
        public void release(){
            System.out.println("running release in File");
        }
        public void getInfo(){
            System.out.println("running getInfo in File");
        }
        public void refresh(){
            System.out.println("running refresh in File");
        }
        public void save(){
            System.out.println("running save in File");
        }
    public void update(){
        System.out.println("running update in File");
    }
}
