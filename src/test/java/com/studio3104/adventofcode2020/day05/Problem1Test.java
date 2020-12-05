package com.studio3104.adventofcode2020.day05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Problem1Test {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("FBFBBFFRLR", new int[]{44, 5}),
                Arguments.of("BFFFBBFRRR", new int[]{70, 7}),
                Arguments.of("FFFBBBFRRR", new int[]{14, 7}),
                Arguments.of("BBFFBBFRLL", new int[]{102, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findPosition(String seat, int[] expected) {
        int[] actual = Problem1.findPosition(seat);
        Assertions.assertArrayEquals(expected, actual);
    }
}
