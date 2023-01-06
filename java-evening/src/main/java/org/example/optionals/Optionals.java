package org.example.optionals;

import java.util.Optional;
import java.util.Random;

public class Optionals {
    static Random r = new Random(112233);

    static Optional<Integer> randomEvenNumber() {
        int n = r.nextInt(100);
        if (n % 2 == 0) {
            return Optional.of(n);
        } else {
            return Optional.empty();
        }
    }

    static Integer randomEvenNumberOrNull() {
        int n = r.nextInt(100);
        if (n % 2 == 0) {
            return n;
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        randomEvenNumber().ifPresentOrElse(
            n -> System.out.println("Even number: " + n),
            () -> System.out.println("No even number")
        );

        Integer n = randomEvenNumberOrNull();
        if (n != null) {
            System.out.println("Even number: " + n);
        } else {
            System.out.println("No even number");
        }
    }
}
