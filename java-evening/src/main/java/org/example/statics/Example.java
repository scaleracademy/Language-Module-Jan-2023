package org.example.statics;

public class Example {

    public static void main(String[] args) {

        var personBuilder = new Person.Builder()
                .name("John")
                .age(30);

        var indianJohn = personBuilder
                .country("India")
                .city("Mumbai")
                .build();

        var americanJohn = personBuilder
                .country("USA")
                .city("New York")
                .build();

        var xuvBuilder = new Vehicle.Builder("Mahindra", "XUV");

        var whiteXUV500 = xuvBuilder
                .color("White")
                .seats(7)
                .build();

        var redXUV300 = xuvBuilder
                .color("Red")
                .seats(5)
                .build();

        Vehicle.count = 10;
        // redXUV300.count = 20;

    }
}
