package org.example.datatypes;

public class Example2 {
    static class Vehicle {
        public String brand = "Ford";

        public void honk() {
            System.out.println("Tuut, tuut!");
        }
    }

    static class Car extends Vehicle {
        public String brand = "Mercedes";

        public void honk() {
            System.out.println("Pom Pom!");
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Car();
        Car c = new Car();
        v.honk();
        System.out.println(v.brand);
        System.out.println(((Car) v).brand);

        System.out.println(c.brand);
        System.out.println(((Vehicle) c).brand);
    }
}
