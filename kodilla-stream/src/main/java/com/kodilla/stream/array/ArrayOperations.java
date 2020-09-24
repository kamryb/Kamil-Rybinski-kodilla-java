package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
        .map(i -> numbers[i])
                .forEach(System.out::println);

       double average = IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average()
                .getAsDouble();

        return average;
    }
}
