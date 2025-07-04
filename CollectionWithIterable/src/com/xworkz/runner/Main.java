package com.xworkz.runner;

import com.xworkz.collection.AeroplaneDTO;
import com.xworkz.collection.BikeDTO;
import com.xworkz.collection.CarDTO;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Collection<BikeDTO> bikeDtos=new LinkedList<>();

        bikeDtos.add(new BikeDTO("Yamaha", "R15 V4", 155, 45.0, 140, "Petrol", "Blue"));
        bikeDtos.add(new BikeDTO("Honda", "CBR 650R", 648, 25.0, 180, "Petrol", "Red"));
        bikeDtos.add(new BikeDTO("KTM", "Duke 390", 373, 28.0, 170, "Petrol", "Orange"));
        bikeDtos.add(new BikeDTO("Royal Enfield", "Classic 350", 346, 35.0, 120, "Petrol", "Black"));
        bikeDtos.add(new BikeDTO("Bajaj", "Pulsar NS200", 199, 40.0, 136, "Petrol", "White"));
        bikeDtos.add(new BikeDTO("TVS", "Apache RTR 160", 159, 45.0, 120, "Petrol", "Grey"));
        bikeDtos.add(new BikeDTO("Suzuki", "Gixxer SF", 155, 48.0, 130, "Petrol", "Blue"));
        bikeDtos.add(new BikeDTO("Hero", "Xtreme 160R", 163, 49.0, 115, "Petrol", "Green"));
        bikeDtos.add(new BikeDTO("BMW", "G 310 R", 313, 30.0, 143, "Petrol", "Black"));
        bikeDtos.add(new BikeDTO("Kawasaki", "Ninja 300", 296, 26.0, 180, "Petrol", "Lime Green"));

        Collection<CarDTO> carDtos = new LinkedList<>();

        carDtos.add(new CarDTO("Toyota", "Fortuner", 2755, 10.0, 180, "Diesel", "White"));
        carDtos.add(new CarDTO("Hyundai", "Creta", 1497, 17.0, 165, "Petrol", "Red"));
        carDtos.add(new CarDTO("Honda", "City", 1498, 18.4, 175, "Petrol", "Silver"));
        carDtos.add(new CarDTO("Tata", "Harrier", 1956, 15.0, 190, "Diesel", "Grey"));
        carDtos.add(new CarDTO("Mahindra", "XUV700", 1997, 16.0, 200, "Petrol", "Black"));
        carDtos.add(new CarDTO("Kia", "Seltos", 1493, 19.0, 170, "Diesel", "Blue"));
        carDtos.add(new CarDTO("Skoda", "Kushaq", 1498, 17.8, 188, "Petrol", "Orange"));
        carDtos.add(new CarDTO("Volkswagen", "Taigun", 1498, 18.5, 185, "Petrol", "Yellow"));
        carDtos.add(new CarDTO("Maruti", "Baleno", 1197, 22.3, 180, "Petrol", "Grey"));
        carDtos.add(new CarDTO("Renault", "Kiger", 999, 20.0, 155, "Petrol", "Silver"));


        List<AeroplaneDTO> aeroplaneDtos = new LinkedList<>();

        aeroplaneDtos.add(new AeroplaneDTO("Air India", "Boeing 787", 242, 903.0, 14140.0, "Turbofan", "White"));
        aeroplaneDtos.add(new AeroplaneDTO("IndiGo", "Airbus A320neo", 180, 829.0, 6300.0, "Turbofan", "Blue"));
        aeroplaneDtos.add(new AeroplaneDTO("SpiceJet", "Boeing 737", 189, 876.0, 5600.0, "Turbofan", "Red"));
        aeroplaneDtos.add(new AeroplaneDTO("Vistara", "Airbus A321", 206, 871.0, 7400.0, "Turbofan", "Purple"));
        aeroplaneDtos.add(new AeroplaneDTO("Emirates", "Airbus A380", 853, 1020.0, 15200.0, "Jet", "White"));
        aeroplaneDtos.add(new AeroplaneDTO("Qatar Airways", "Boeing 777", 396, 950.0, 15600.0, "Jet", "Silver"));
        aeroplaneDtos.add(new AeroplaneDTO("Lufthansa", "Airbus A340", 375, 900.0, 13400.0, "Jet", "White"));
        aeroplaneDtos.add(new AeroplaneDTO("British Airways", "Boeing 747", 416, 988.0, 13850.0, "Jet", "Blue"));
        aeroplaneDtos.add(new AeroplaneDTO("GoAir", "Airbus A320", 180, 828.0, 6100.0, "Turbofan", "Teal"));
        aeroplaneDtos.add(new AeroplaneDTO("Etihad", "Boeing 787 Dreamliner", 299, 913.0, 13600.0, "Turbofan", "Gold"));


        Iterator<BikeDTO> bikeDTOIterator= bikeDtos.iterator();
        while (bikeDTOIterator.hasNext()){      
            System.out.println(bikeDTOIterator.next());
        }
        System.out.println("================================================");

        Iterator<CarDTO> carDTOIterator= carDtos.iterator();
        while (carDTOIterator.hasNext()){
            System.out.println(carDTOIterator.next());
        }
        System.out.println("================================================");


        Iterator<AeroplaneDTO> aeroplaneDTOIterator=aeroplaneDtos.iterator();
        while(aeroplaneDTOIterator.hasNext()){
            System.out.println(aeroplaneDTOIterator.next());
        }
        System.out.println("================================================");

    }
}
