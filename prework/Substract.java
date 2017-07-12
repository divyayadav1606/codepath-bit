/**
 * Checkpoint 4
 *
 * Given a singly linked list, modify the value of first half nodes such that :
 * 1st node’s new value = the last node’s value - first node’s current value
 * 2nd node’s new value = the second last node’s value - 2nd node’s current value,
 * Given linked list 1 -> 2 -> 3 -> 4 -> 5, You should return 4 -> 2 -> 3 -> 4 -> 5
 *
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode subtract(ListNode a) {

        if ( a == null || a.next == null)
            return a;

        ListNode slow = a;
        ListNode fast = a.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = reverse(slow.next);
        ListNode curr = temp;
        ListNode head = a;

        while (head != null && curr != null) {
            head.val = curr.val - head.val;
            head = head.next;
            curr = curr.next;
        }

        reverse(temp);
        return a;
    }

    private ListNode reverse(ListNode a) {
        ListNode prev = null;
        ListNode current = a;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        a = prev;
        return a;
    }
}
