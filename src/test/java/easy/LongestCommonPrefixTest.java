package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LongestCommonPrefixTest {

    @ParameterizedTest
    @MethodSource("prepare")
    void testLongestCommonPrefix(String[] input, String expected) {
        LongestCommonPrefix udt = new LongestCommonPrefix();
        String result = udt.longestCommonPrefix(input);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> prepare() {
        return Stream.of(
                Arguments.of(new String[]{"flower","flow","flight"}, "fl"),
                Arguments.of(new String[]{"dog","racecar","car"}, ""),
                Arguments.of(new String[]{"dogy","dog","dogu"}, "dog"),
                Arguments.of(new String[]{"dog","racecar",""}, ""),
                Arguments.of(new String[]{"dog"}, "dog"),
                Arguments.of(new String[]{"dog","dog"}, "dog"),
                Arguments.of(new String[]{""}, "")
        );
    }
}