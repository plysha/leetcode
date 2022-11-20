package easy;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        if (head.next == null) return head;
        ListNode current = head;
        ListNode next = current.next;

        while (current.next!=null) {
            if  (next == null) break;
            if (current.val == next.val) {
                next = next.next;
            } else {
                current.next = next;
                current = next;
            }
        }

        if (current.next!=null) {
            current.next = null;
        }

        return head;
    }

    /*Good solution*/
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            //First we check if the head is null or not
            // if the head is null we simply return the head
            if(head == null) return head;
            ListNode node = head;
            //Here we perform a while loop until the node value is null
            while(node.next != null){
                //Through a if else condition we check if the value of the current node is equal to the value of the next node
                //if the value of the current node is same as the next one we simply skip the next node by "node.next = node.next.next"
                if(node.val == node.next.val) node.next = node.next.next;
                else node = node.next;
            }
            return head;
        }
    }
}
