package com.xworkz.RefAndvar;

public class PersnolAssistance {
        String name;
        String jobtitile;
        String skill;
        int experience;

        PersnolAssistance(String name, String jobtitile, String skill, int experience){
            this.name=name;
            this.jobtitile=jobtitile;
            this.skill=skill;
            this.experience=experience;

        }
        void assistancemethod(){
            System.out.println("Assistance:");
            System.out.println("name:"+this.name);
            System.out.println("jobtitile:"+this.jobtitile);
            System.out.println("skill:"+this.skill);
            System.out.println("experience:"+this.experience);


        }

}
