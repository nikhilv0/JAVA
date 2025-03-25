package com.xworkz.RefAndvar;

public class Room {

    String roomType;
    int roomNumber;
    double roomSize;
    boolean isOccupied;


    Room(String roomType, int roomNumber, double roomSize, boolean isOccupied) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.roomSize = roomSize;
        this.isOccupied = isOccupied;
    }


    void RoomMethod() {
        System.out.println("Room:");
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Size: " + roomSize );
        System.out.println("Occupied: " + isOccupied);
    }
}


