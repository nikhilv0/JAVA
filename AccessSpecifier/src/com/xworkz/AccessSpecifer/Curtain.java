package com.xworkz.AccessSpecifer;

public class Curtain {
    Window window;

        public Curtain(Window window){
           this.window=window;
        }
        public void curtaindis(){
            this.window.open();
            System.out.println("Type:"+this.window.type);
        }
}
