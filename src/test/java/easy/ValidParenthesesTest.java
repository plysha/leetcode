package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class ValidParenthesesTest {

    @ParameterizedTest
    @MethodSource("prepare")
    void testValidParentheses(String input, boolean expected) {
        ValidParentheses udt = new ValidParentheses();
        boolean result = udt.isValid(input);
        Assertions.assertEquals(expected, result);
    }


    static Stream<Arguments> prepare() {
        return Stream.of(
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("]", false),
                Arguments.of(")", false),
                Arguments.of("}", false),
                Arguments.of("(", false),
                Arguments.of("{", false),
                Arguments.of("[", false),
                Arguments.of("(([]))", true),
                Arguments.of("(((((({{{{{[[[[[[(({{{(([]))}}}))]]]]]]}}}}}))))))", true)
        );
    }
}