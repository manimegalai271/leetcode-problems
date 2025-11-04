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
    public void reorderList(ListNode head) {
        if(head.next == null)
        {
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode firsthalf = head;
        ListNode tail = firsthalf;
        int count = 0;
        while(fast != null && fast.next != null)
        {   if(count > 0)
            {
               tail = tail.next;
            }
            fast = fast.next.next;
            slow = slow.next;
            count++;
        }
        tail.next  = null;
        ListNode prev = null;
        ListNode curr = slow;
        ListNode nextnode = slow;
        while(curr != null)
        {
            nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        } 
        head = null;
        ListNode first = firsthalf;
        ListNode second = prev;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while(first != null && second != null)
        {   
            cur.next = first;
            first = first.next;
            cur = cur.next;

            cur.next = second;
            second = second.next;
            cur = cur.next;
        }
        if(first != null)cur.next = first;
        head = dummy.next;
    }
}