package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @ParameterizedTest
    @MethodSource(value = "prepare")
    void testRomanToInteger(String in, int expected) {
        var romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt(in);
        Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments> prepare() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("DCXXI", 621)
        );
    }

}