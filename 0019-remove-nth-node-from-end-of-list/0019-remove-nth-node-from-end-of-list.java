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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = head;
        int l = 0;
        while(dummy != null)
        {
            l++;
            dummy = dummy.next;
        }
        dummy = head;
        if(n == l)
        {
            return head.next;
        }
        for(int i = 1;i < l-n;i++)
        {
            dummy = dummy.next;
        }
        dummy.next = dummy.next.next;
        return head;
    }
}