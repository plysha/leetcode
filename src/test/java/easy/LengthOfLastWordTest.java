package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LengthOfLastWordTest {

    @ParameterizedTest
    @MethodSource(value = "prepare")
    void testTwoSum(String input, int expected) {
        var lengthOfLastWord = new LengthOfLastWord();
        var result = lengthOfLastWord.lengthOfLastWord(input);
        Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments> prepare() {
        return Stream.of(
                Arguments.of("Hello World",5),
                Arguments.of("   fly me   to   the moon  ", 4),
                Arguments.of("luffy is still joyboy", 6)
        );
    }
}
