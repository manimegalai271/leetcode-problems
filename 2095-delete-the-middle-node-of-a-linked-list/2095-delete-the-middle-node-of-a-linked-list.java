/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        // Step 1: Count nodes
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Step 2: Find node before the middle
        int mid = count / 2;
        ListNode t = head;
        for (int i = 0; i < mid - 1; i++) {
            t = t.next;
        }

        // Step 3: Delete the middle node
        t.next = t.next.next;

        return head;
    }
}