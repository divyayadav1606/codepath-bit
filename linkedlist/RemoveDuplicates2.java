/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode a) {
        ListNode head = a;
        ListNode prev = null;

        if (a == null)
            return a;

        while (a != null) {
            boolean match = false;

            while((a.next != null) && (a.val == a.next.val)) {
                a.next = a.next.next;
                match = true;
            }

            if (match) {
                if (prev == null) {
                    head = a.next;
                    a = head;
                } else {
                    prev.next = a.next;
                    a = a.next;
                }
            } else if (a != null) {
                prev = a;
                a = a.next;
            }
        }

        return head;
    }
}
