package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PalindromeNumberTest {

    @ParameterizedTest
    @MethodSource(value = "prepare")
    void isPalindromeNumberTest(int x, boolean expected) {
        var underTest = new PalindromeNumber();
        boolean result = underTest.isPalindrome(x);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> prepare() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(0, true),
                Arguments.of(234, false),
                Arguments.of(23432, true)
        );
    }
}