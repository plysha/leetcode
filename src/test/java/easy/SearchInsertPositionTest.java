package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SearchInsertPositionTest {


    @ParameterizedTest
    @MethodSource(value = "prepare")
    void testSearchInsertPosition(int[] nums, int target, int expectedResult) {
        SearchInsertPosition underTest = new SearchInsertPosition();
        var result = underTest.searchInsert(nums, target);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> prepare() {
        return Stream.of(
                Arguments.of(new int[]{1,3,5,6}, 5, 2),
                Arguments.of(new int[]{1,3,5,6}, 2, 1)
        );
    }
}
