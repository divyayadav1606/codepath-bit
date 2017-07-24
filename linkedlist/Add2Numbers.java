/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode head = null;
        ListNode temp = null;

        int carry = 0;
        int sum = 0;
        if (a == null || b == null)
            return (a != null ? a:b);

        while (a != null || b != null) {
            sum = ((a != null ? a.val:0) + (b != null ? b.val:0) + carry);
            carry = sum / 10;
            sum = sum % 10;

            if (a != null)
                a = a.next;

            if (b != null)
                b = b.next;

            if (temp == null) {
                temp = new ListNode(sum);
                head = temp;
            } else {
                temp.next = new ListNode(sum);
                temp = temp.next;
            }

        }

        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return head;
    }
}
