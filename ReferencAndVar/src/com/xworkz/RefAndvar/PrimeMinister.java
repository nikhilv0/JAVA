package com.xworkz.RefAndvar;

public class PrimeMinister {
        String name;
        String Country;
        String PoliticalParty;
        String PreviousPositions;

        PrimeMinister(String name,String Country,String PoliticalParty,String PreviousPositions){
            this.name=name;
            this.Country=Country;
            this.PoliticalParty=PoliticalParty;
            this.PreviousPositions=PreviousPositions;
        }
    void primeMethod(){
        System.out.println("Prime Minister:");
        System.out.println("Name:"+this.name);
        System.out.println("Country:"+this.Country);
        System.out.println("PoliticalParty:"+this.PoliticalParty);
        System.out.println("PreviousPositions:"+this.PreviousPositions);

        Minister minister1=new Minister("Aryan","Dept of that","1-1-2025","1-1-2030");
        Minister minister2=new Minister("Shashank","Dept of this","2-2-2025","2-2-2030");
        Minister minister3=new Minister("Hickey","Dept of that and this","3-3-2025","3-3-2030");
        Minister minister4=new Minister("Chapri","Dept of this and that","4-4-2025","4-4-2030");
        Minister minister5=new Minister("Bahubali","Dept of everything","5-5-2025","5-5-2030");
        Minister[] ministers={minister1,minister2,minister3,minister4,minister5};
        for(Minister minister:ministers){
            minister.ministermethod();
        }




    }
}
