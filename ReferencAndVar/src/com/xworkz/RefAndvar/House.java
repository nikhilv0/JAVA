package com.xworkz.RefAndvar;

public class House {
    String owner;
    String Address;
    int noOfrooms;
    String type;

    House(String owner,String Address,int noOfrooms,String type){
        this.owner=owner;
        this.Address=Address;
        this.noOfrooms=noOfrooms;
        this.type=type;


    }
    void Housemethod(){
        System.out.println("House:");
        System.out.println("owner:"+this.owner);
        System.out.println("Address:"+this.Address);
        System.out.println("noOfrooms:"+this.noOfrooms);
        System.out.println("type:"+this.type);

        Room room1=new Room("Double Sharing",121,125d,false);
        Room room2=new Room("Single Sharing",122,125d,true);
        Room room3=new Room("Double Sharing",123,225d,false);
        Room room4=new Room("thriple Sharing",124,305d,false);
        Room room5=new Room("Double Sharing",125,225d,true);
        Room room6=new Room("Double Sharing",126,225d,false);
        Room room7=new Room("Single Sharing",211,105d,true);
        Room room8=new Room("Thriple Sharing",212,305d,false);
        Room room9=new Room("4 Sharing",402,405d,false);
        Room[] rooms={room1,room2,room3,room4,room5,room6,room7,room8,room9};
        for (Room room:rooms){
            room.RoomMethod();


        HouseKeep houseKeep1=new HouseKeep("Aryan",121,true,"Morning");
        HouseKeep houseKeep2=new HouseKeep("Shashank",122,false,"Morning");
        HouseKeep houseKeep3=new HouseKeep("sanjana",123,true,"Morning");
        HouseKeep houseKeep4=new HouseKeep("Nayana",124,true,"Night");
        HouseKeep houseKeep5=new HouseKeep("bahu",125,true,"Afternoon");
        HouseKeep houseKeep6=new HouseKeep("katta",126,false,"Morning");
        HouseKeep[] houseKeeps={houseKeep1,houseKeep2,houseKeep3,houseKeep4,houseKeep5,houseKeep6};
        for (HouseKeep houseKeep:houseKeeps){
            houseKeep.HousekeepMethod();
        }
        }
    }
}
