package com.xworkz.AccessSpecifer;

public class Window {
        public int size;
        private double price;
        String type;

        void open(){
            System.out.println("Type"+type);
        }
        private void close(){
            System.out.println("Price:"+price);
        }
        public void func(){
            close();

        }

}
