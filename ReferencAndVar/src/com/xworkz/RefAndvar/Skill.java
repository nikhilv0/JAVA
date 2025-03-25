package com.xworkz.RefAndvar;

public class Skill {
    String name;
    int proficiencyLevel;
    int yearsOfExperience;
    boolean isCertified;

    Skill(String name, int proficiencyLevel, int yearsOfExperience, boolean isCertified) {
        this.name = name;
        this.proficiencyLevel = proficiencyLevel;
        this.yearsOfExperience = yearsOfExperience;
        this.isCertified = isCertified;
    }

    void SkillMehtod() {
        System.out.println("Skill:");
        System.out.println("Skill: " + name);
        System.out.println("Proficiency Level: " + proficiencyLevel);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Certified: " + isCertified);

        Experience experience=new Experience("IT",10,"Full Stack JAVA","Bangaluru");
        experience.experienceMethod();
    }
}
