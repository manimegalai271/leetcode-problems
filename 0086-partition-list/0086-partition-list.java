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
    public ListNode partition(ListNode head, int x) {
        ListNode lessnode = new ListNode(0);
        ListNode highnode = new ListNode(0);
        ListNode less = lessnode;
        ListNode high = highnode;
        while(head != null)
        {
            if(head.val < x)
            {
                less.next = head;
                less = less.next;
                head = head.next;
            }
            else
            {
                high.next = head;
                high = high.next;
                head = head.next;
            }
        }
        high.next = null;
        less.next = highnode.next;
        return lessnode.next;
    }
}