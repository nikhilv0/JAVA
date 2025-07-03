package com.xworkz.collection.dto;

    public class AeroplaneDTO {
        private String airline;
        private String model;
        private int capacity;
        private double maxSpeed;
        private double range;
        private String engineType;
        private String color;

        public AeroplaneDTO(String airline, String model, int capacity, double maxSpeed, double range, String engineType, String color) {
            this.airline = airline;
            this.model = model;
            this.capacity = capacity;
            this.maxSpeed = maxSpeed;
            this.range = range;
            this.engineType = engineType;
            this.color = color;
        }

        public String getAirline() {
            return airline;
        }

        public void setAirline(String airline) {
            this.airline = airline;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public double getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(double maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public double getRange() {
            return range;
        }

        public void setRange(double range) {
            this.range = range;
        }

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "AeroplaneDTO{" +
                    "airline='" + airline + '\'' +
                    ", model='" + model + '\'' +
                    ", capacity=" + capacity +
                    ", maxSpeed=" + maxSpeed +
                    ", range=" + range +
                    ", engineType='" + engineType + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }


