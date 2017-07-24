/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode a, int b) {

        if (a == null || a.next == null || b == 0)
            return a;

        ListNode slow = a;
        ListNode fast = a;
        ListNode head = a;

        for (int i = 0; i < b; i++)
            if (fast.next != null)
                fast = fast.next;
            else
                fast = a;


        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if (fast != slow) {
            head = slow.next;
            fast.next = a;
            slow.next = null;
        }

        return head;

    }
}
