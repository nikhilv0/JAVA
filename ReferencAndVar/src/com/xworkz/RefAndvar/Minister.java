package com.xworkz.RefAndvar;

import java.util.Date;

public class Minister {
    String name;
    String department;
    String  startdate;
    String enddate;

    Minister(String name,String department, String startdate,String enddate){
        this.name=name;
        this.department=department;
        this.startdate=startdate;
        this.enddate=enddate;

    }
    void ministermethod(){
        System.out.println("Minister:");
        System.out.println("Name:"+this.name);
        System.out.println("department:"+this.department);
        System.out.println("StartDate:"+this.startdate);
        System.out.println("Enddate:"+this.enddate);

        PersnolAssistance persnolAssistance =new PersnolAssistance("katappa","PersonalAssistance","Everything",10);
        persnolAssistance.assistancemethod();

        House house=new House("Don","#303 C wing A block platinum city",3,"Flat");
        house.Housemethod();

        Portfolio portfolio1=new Portfolio("Chapri","Investment","1-1-2025",new Date());
        Portfolio portfolio2=new Portfolio("Hickey","Investment","2-2-2025",new Date());
        Portfolio portfolio3=new Portfolio("devara","Investment","3-3-2025",new Date());
        Portfolio portfolio4=new Portfolio("Salaar","Investment","4-4-2025",new Date());
        Portfolio portfolio5=new Portfolio("Kalki","Investment","5-5-2025",new Date());
        Portfolio[] portfolios={portfolio1,portfolio2,portfolio3,portfolio4,portfolio5};
        for (Portfolio portfolio:portfolios){
            portfolio.Portfoliomethod();

        Security security=new Security("Z Security","1234567890","highlevel","sdfhih");
        security.securityMethod();

        State state1=new State("KARNATAKA",73d,"Aryan","Kannada");
        State state2=new State("HYDERABAD",11.3d,"Shashank","Telugu");
        State state3=new State("MAHARASHTRA",128.66d,"Nikhil","Marati");
        State state4=new State("TAMIL NADU",76.86d,"DON","Tamil");
        State[] states={state1,state2,state3,state4};
        for (State state:states){
            state.stateMethod();
        }
        }
    }
}
