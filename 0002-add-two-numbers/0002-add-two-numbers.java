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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode curr = dummyNode;
        ListNode n1 = l1;
        ListNode n2 = l2;
        int carry = 0;
        while(n1 != null || n2 != null)
        {
            int sum = carry;
            if(n1 != null)
            {
                sum+= n1.val;
                n1= n1.next;
            }
            if(n2 != null)
            {
                sum+= n2.val;
                n2= n2.next;
            }
            ListNode newnode = new ListNode(sum%10);
            carry = sum/10;

            curr.next = newnode;
            curr = newnode;
        }
        if(carry > 0)
        {
            curr.next = new ListNode(carry);
        }
        return dummyNode.next;
    }
}