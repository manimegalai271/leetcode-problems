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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(head != null)
        {
            Boolean flag = false;
            while(head.next != null && head.val == head.next.val)
            {
                head = head.next;
                flag = true;
            }
            if(flag)
            {
                curr.next = head.next;
            }
            else 
            {
                curr = curr.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}