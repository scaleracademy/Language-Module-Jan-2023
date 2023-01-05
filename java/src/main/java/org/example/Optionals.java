package org.example;

import java.util.Optional;
import java.util.Random;

public class Optionals {
    static Random r = new Random(123);

    static Optional<Integer> getOptional() {
        var i = r.nextInt(100);
        if (i < 50) {
            return Optional.empty();
        } else {
            return Optional.of(i);
        }
    }

    public static void main(String[] args) {

        getOptional().ifPresentOrElse(
                i -> System.out.println("Got value: " + i),
                () -> System.out.println("Got nothing")
        );

        var value = getOptional().orElse(/* default use case */ 0);
        System.out.println("Got value: " + value);
    }
}
