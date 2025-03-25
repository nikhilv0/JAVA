package com.xworkz.RefAndvar;

public class Experience {
    String industry;
    int projectsCompleted;
    String skillSet;
    String location;

    Experience(String industry, int projectsCompleted, String skillSet, String location) {
        this.industry = industry;
        this.projectsCompleted = projectsCompleted;
        this.skillSet = skillSet;
        this.location = location;
    }

    void experienceMethod() {
        System.out.println("Experience:");
        System.out.println("Industry: " + industry);
        System.out.println("Projects Completed: " + projectsCompleted);
        System.out.println("Skill Set: " + skillSet);
        System.out.println("Location: " + location);

        ExperienceDetail experienceDetail1=new ExperienceDetail("Google",7,"Senior Software Enginee",2500000d);
        ExperienceDetail experienceDetail2=new ExperienceDetail("Microsoft",5,"Cloud Architect",2000000d);
        ExperienceDetail experienceDetail3=new ExperienceDetail("Amazon",4,"DevOps Engineer",1800000d);
        ExperienceDetail experienceDetail4=new ExperienceDetail("Infosys",3,"Software Developer",120000d);
        ExperienceDetail experienceDetail5=new ExperienceDetail("TCS",6,"Full Stack Developer",160000d);
        ExperienceDetail[] experienceDetails={experienceDetail1,experienceDetail2,experienceDetail3,experienceDetail4,experienceDetail5};
        for(ExperienceDetail experienceDetail:experienceDetails){
            experienceDetail.ExperienceDetailmethod();
        }

    }
}

