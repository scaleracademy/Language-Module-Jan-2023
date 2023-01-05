package streams;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        var squareMapper = (Function<Integer, Integer>) integer -> integer * integer;
        var evenFilter = (Predicate<Integer>) integer -> integer % 2 == 0;

        var filteredSquaredNumsStreams = numbers.stream()
                .filter(evenFilter)
                .peek(n -> System.out.println("Peek (Stage 1): " + n))
                .peek(n -> {
                    System.out.println(n); // for debugger
                })
                .map(squareMapper)
                .peek(n -> System.out.println("Peek (Stage 2): " + n))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(filteredSquaredNumsStreams);


        final int[] max = {0};
        numbers.stream()
                .forEach(n -> {
                    if (n > max[0]) {
                        max[0] = n;
                    }
                });

        System.out.println("Max: " + max[0]);
    }
}
