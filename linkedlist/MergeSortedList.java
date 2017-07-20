/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists, and should also be sorted.
 *
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode head = new ListNode(0);
        ListNode result = head;

        while (a != null && b != null) {
            if (a.val < b.val) {
                head.next = a;
                a = a.next;
            } else {
                head.next = b;
                b = b.next;
            }
            head = head.next;
        }

        if (a != null) {
            head.next = a;
        }

        if (b != null) {
            head.next = b;
        }

        return result.next;
    }
}
