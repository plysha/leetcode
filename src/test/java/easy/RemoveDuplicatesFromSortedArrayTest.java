package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @ParameterizedTest
    @MethodSource("prepare")
    void removeDuplicatesFromSortedArrayTest(int[] input, int expectedSize, int[] expected) {
        int actualSize = new RemoveDuplicatesFromSortedArray().removeDuplicates(input);
        Assertions.assertEquals(expectedSize, actualSize);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], input[i]);
        }
    }


    static Stream<Arguments> prepare() {
        return Stream.of(
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5, new int[]{0, 1, 2, 3, 4}),
                Arguments.of(new int[]{0}, 1, new int[]{0}),
                Arguments.of(new int[]{1, 1, 2}, 2, new int[]{1, 2}),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5, new int[]{0, 1, 2, 3, 4})
        );
    }
}