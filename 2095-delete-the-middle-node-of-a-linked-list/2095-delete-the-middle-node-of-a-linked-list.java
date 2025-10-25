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
        if(head == null && head.next == null)
        {
            return null;
        }
        ListNode temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        int i = 0;
        ListNode t = head;
        while(t != null && i < (count / 2)-1)
        {
            t = t.next;
            i++;
        }
        t.next = t.next.next;
        return head;
    }
}