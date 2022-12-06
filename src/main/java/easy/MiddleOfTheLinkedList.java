package easy;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        ListNode currentMiddleNode = head;
        int count = 1;
        int currentMiddle = 0;


        while (current.next != null) {
            current = current.next;
            count++;
            int middle = count/2;

            if  (middle > currentMiddle) {
                currentMiddleNode = currentMiddleNode.next;
                currentMiddle = middle;
            }
        }

        return currentMiddleNode;
    }
}

/*

*It is very easy to find the middle node of the linked list.
Steps:-

1.Make Two pointers i.e slow and fast which points to the head of the linked list.
2.Run a while loop until next node of fast is not equal to null AND next to next node of fast is not equal to null.
3.Slow will move one node to the right.
4.Fast will move two nodes to the right.
5.When while loop will end, the slow node will point to the middle node.
* Goood solution
* class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
*
* */
