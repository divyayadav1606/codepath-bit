/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode a) {
        if (a == null)
            return null;
        ListNode head = a;

        while (a != null && a.next != null) {
            if (a.val == a.next.val) {
                a.next = a.next.next;
            } else {
                a = a.next;
            }
        }
        return head;
    }
}
