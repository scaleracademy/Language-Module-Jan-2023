package org.example.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streaming {

    public static void main(String[] args) {
        var numList = List.of(12, 354, 45, 53, 23, 68);

        // root mean square
        var sqrList = numList.stream()
                .peek(i -> System.out.println("Stage 1: " + i))
                .mapToInt(n -> n * n)
                .peek(i -> System.out.println("Stage 2: " + i))
                .average();

        numList.stream().collect(
                ArrayList::new,
                ArrayList::add,
                ArrayList::addAll
        );


        var rms = Math.sqrt(sqrList.getAsDouble());
        System.out.println("RMS: " + rms);








    }
}
