package com.kodilla.matrix.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){

        IntStream.range(0, numbers.length)
                .map(n ->numbers[n])
                .forEach(System.out::println);

        double averageNumber = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();
        return averageNumber;
    }
}
