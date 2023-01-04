package org.example.statics;

public class Vehicle {
    String brand;
    String model;
    int seats;
    String color;

    private Vehicle(String brand, String model, int seats, String color) {
        this.brand = brand;
        this.model = model;
        this.seats = seats;
        this.color = color;
    }

    static class Builder {
        String brand;
        String model;
        int seats;
        String color;

        public Builder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public Builder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(brand, model, seats, color);
        }
    }
}
