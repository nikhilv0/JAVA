package com.xworkz.RefAndvar;

public class ExperienceDetail {
    String companyName;
    int yearsOfExperience;
    String jobTitle;
    double salary;

    ExperienceDetail(String companyName, int yearsOfExperience, String jobTitle, double salary) {
        this.companyName = companyName;
        this.yearsOfExperience = yearsOfExperience;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void  ExperienceDetailmethod() {
        System.out.println("Experience Detail:");
        System.out.println("Company Name: " + companyName);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        Company company=new Company("xworkz","Rajajinagar",100,1000000.0);
        company.companyMethod();
        Education education1=new Education("JainVidyalaya",1000,90,"Stateborad");
        Education education2=new Education("Siddaganga",900,84,"Stateborad");
        Education education3=new Education("Amrutha amma",950,70,"CBSE");
        Education education4=new Education("bapuji",2000,80,"Stateborad");
        Education education5=new Education("Psmr",10000,95,"CBSE");
        Education[] educations={education1,education2,education3,education4,education5};
        for (Education education:educations){
            education.educationMethod();
        }
    }
}
