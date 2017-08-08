/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    ListNode head = null;
    public ListNode reverseList(ListNode a) {
        if (a.next == null) {
            head = a;
            return head;
        }
        reverseList(a.next);

        ListNode temp = a.next;
        temp.next = a;
        a.next = null;
        return head;
    }
}
