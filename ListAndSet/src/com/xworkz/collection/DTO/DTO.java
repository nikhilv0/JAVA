
package com.xworkz.collection.DTO;
import java.io.Serializable;
import java.util.Objects;

public class DTO implements Serializable{

        private String place;
        private String food;
        private double price;
        private int year;

        public DTO() {
            System.out.println("Created TravelFoodDTO using no-arg constructor");
        }

        public DTO(String place, String food, double price, int year) {
            this.place = place;
            this.food = food;
            this.price = price;
            this.year = year;
        }

        public String getPlace() {
            return place;
        }

        public void setPlace(String place) {
            this.place = place;
        }

        public String getFood() {
            return food;
        }

        public void setFood(String food) {
            this.food = food;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "TravelFoodDTO{" +
                    "place='" + place + '\'' +
                    ", food='" + food + '\'' +
                    ", price=" + price +
                    ", year=" + year +
                    '}';
        }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof DTO)) return false;
        DTO dto = (DTO) o;
        return Double.compare(price, dto.price) == 0 && year == dto.year && Objects.equals(place, dto.place) && Objects.equals(food, dto.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, food, price, year);
    }
}
