/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        int len = 0;

        ListNode current = A;
        ListNode head = null;
        ListNode last = null;

        if (A == null || B < 2)
            return A;

        while (A != null) {
            A = A.next;
            len++;
        }

        while (len > 0) {
            ListNode prev = null;
            ListNode next = null;
            int m = B;
            ListNode temp = current;
            while (m > 0) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                m--;
                len--;
            }

            if (head == null) {
                head = prev;
                temp.next = current;
                last = temp;
            } else {
                last.next = prev;
                temp.next = current;
                last = temp;
            }
        }

        return head;
    }
}
