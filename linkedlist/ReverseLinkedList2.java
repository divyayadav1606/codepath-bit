/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    private ListNode reverse(ListNode a, int count) {
        ListNode prev = null;
        ListNode current = a;
        ListNode next = null;

        while (current != null && count > 0) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count--;
        }
        a.next = current;
        return prev;
    }

    public ListNode reverseBetween(ListNode a, int m, int n) {
        ListNode start = a;
        ListNode prev = null;

        if (a == null)
            return a;

        n--;
        m--;

        for (int i = 0; i < m; i++) {
            prev = start;
            start = start.next;
        }

        if (prev == null)
            a = reverse(start, n-m+1);
        else
            prev.next = reverse(start, n-m+1);

        return a;
    }
}
