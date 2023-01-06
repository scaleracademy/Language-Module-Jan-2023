package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class Streaming {

    public static void main(String[] args) {
        var numList = List.of(12, 354, 45, 53, 23, 68);

        // root mean square
        numList.stream()
                .peek(i -> System.out.println("Stage 1: " + i))
                .mapToInt(n -> n * n)
                .peek(i -> System.out.println("Stage 2: " + i))
                .average().ifPresentOrElse(
                        n -> System.out.println("Average: " + Math.sqrt(n)),
                        () -> System.out.println("No average")
                );

        numList.stream().collect(
                ArrayList::new,
                ArrayList::add,
                ArrayList::addAll
        );


    }
}
