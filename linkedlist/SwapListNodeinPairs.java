/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode a) {
        ListNode head = null;
        ListNode temp = null;

        while (a != null && a.next != null) {
            ListNode prev = null;
            ListNode next = null;
            ListNode current = a;

            for (int i = 0; i < 2; i++) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            if (head == null) {
                head = prev;
            } else {
                temp.next = prev;
            }
            a.next = current;
            temp = a;
            a = a.next;
        }

        return (head == null ? a : head);
    }
}
