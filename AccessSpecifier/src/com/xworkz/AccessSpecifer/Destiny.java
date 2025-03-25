package com.xworkz.AccessSpecifer;

public class Destiny {
        Travel travel;

        public Destiny(Travel travel){
            this.travel=travel;
        }
        public void destinydisplay(){
            this.travel.design();
            System.out.println("Plan:"+this.travel.plan);
        }
    }

