package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class ListNodeTest {

    @ParameterizedTest
    @MethodSource("prepare")
    void testListNodeTest(ListNode list1, ListNode list2, ListNode expected) {
        MergeTwoSortedLists udt = new MergeTwoSortedLists();
        ListNode result = udt.mergeTwoLists(list1, list2);
        Assertions.assertEquals(toString(expected), toString(result));
    }

    static Stream<Arguments> prepare() {
        return Stream.of(
                Arguments.of(linkListNode(1, 2, 4), linkListNode(1, 3, 4), linkListNode(1, 1, 2, 3, 4, 4)),
                Arguments.of(linkListNode(0), linkListNode(0), linkListNode(0,0)),
                Arguments.of(null, linkListNode(0), linkListNode(0))
        );
    }

    static ListNode linkListNode(Integer... item) {
        ListNode tmp = new ListNode(0);
        ListNode first = tmp;

        for (Integer integer : item) {
            first.next = new ListNode(integer);
            first = first.next;
        }

        return tmp.next;
    }

    static String toString(ListNode listNode) {
        List<String> ints = new ArrayList<>();
        while (listNode != null) {
            ints.add(String.valueOf(listNode.val));
            listNode = listNode.next;
        }

        return String.join(",", ints);
    }

}