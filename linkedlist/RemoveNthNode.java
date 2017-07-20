/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 *
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode a, int b) {
        if (a == null)
            return null;

        ListNode slow = a;
        ListNode fast = a;
        int counter = 0;

        while (counter < b) {
            if (fast != null) {
                fast = fast.next;
                counter++;
            } else
                break;
        }

        if (fast == null) {
            a = a.next;
            return a;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return a;
    }
}
