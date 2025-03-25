package com.xworkz.RefAndvar;

public class HouseKeep {
    String cleanerName;
    int roomNumber;
    boolean isOccupied;
    String shiftTime;

    HouseKeep(String cleanerName, int roomNumber, boolean isOccupied, String shiftTime) {
        this.cleanerName = cleanerName;
        this.roomNumber = roomNumber;
        this.isOccupied = isOccupied;
        this.shiftTime = shiftTime;
    }

    void HousekeepMethod() {
        System.out.println("House Keep:");
        System.out.println("Cleaner: " + cleanerName);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Occupied: " + isOccupied);
        System.out.println("Shift: " + shiftTime);

        Transport transport=new Transport("Flight",10000,1000000d,"Airlines");
        transport.TransportMethod();
    }
}
