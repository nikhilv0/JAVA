package com.xworkz.collection.dto;

    public class BikeDTO {
        private String brand;
        private String model;
        private int engineCapacity;
        private double mileage;
        private int topSpeed;
        private String fuelType;
        private String color;

        public BikeDTO(String brand, String model, int engineCapacity, double mileage, int topSpeed, String fuelType, String color) {
            this.brand = brand;
            this.model = model;
            this.engineCapacity = engineCapacity;
            this.mileage = mileage;
            this.topSpeed = topSpeed;
            this.fuelType = fuelType;
            this.color = color;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getEngineCapacity() {
            return engineCapacity;
        }

        public void setEngineCapacity(int engineCapacity) {
            this.engineCapacity = engineCapacity;
        }

        public double getMileage() {
            return mileage;
        }

        public void setMileage(double mileage) {
            this.mileage = mileage;
        }

        public int getTopSpeed() {
            return topSpeed;
        }

        public void setTopSpeed(int topSpeed) {
            this.topSpeed = topSpeed;
        }

        public String getFuelType() {
            return fuelType;
        }

        public void setFuelType(String fuelType) {
            this.fuelType = fuelType;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

    }

