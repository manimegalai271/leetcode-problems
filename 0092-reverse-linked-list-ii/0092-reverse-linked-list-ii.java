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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }

        // Dummy node before head (to handle when left = 1)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 1: Move to the node before the 'left' position
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 2: Start reversing from 'left' to 'right'
        ListNode start = prev.next;        // first node to reverse
        ListNode curr = start.next;        // next node after start

        // Reverse nodes between left and right
        for (int i = 0; i < right - left; i++) {
            ListNode nextNode = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = nextNode;
        }

        // Step 3: Connect the reversed part to the rest of the list
        start.next = curr;

        // Step 4: Return the new head
        return dummy.next;
    }
}