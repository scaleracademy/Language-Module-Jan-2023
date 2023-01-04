package org.example.statics;

public class Person {
    String name;
    int age;
    Address address;

    private Person(String name, int age, String country, String city) {
        this.name = name;
        this.age = age;
        this.address = new Address(country, city);
    }

    private class Address {
        String country;
        String city;

        boolean isForeigner() {
            return !country.equals("India");
        }

        private  Address(String country, String city) {
            this.country = country;
            this.city = city;
        }
    }

    static class Builder {
        String name;
        int age;
        String country;
        String city;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Person build() {
            return new Person(name, age, country, city);
        }
    }
}
