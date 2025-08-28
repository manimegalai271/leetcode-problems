/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head,fast =head;
        while(fast != null)
        {
            fast = fast.next;
            if(fast != null)
            {
               fast = fast.next;
               slow = slow.next;
            }
            if(fast == slow)
            {
                slow = head;
                while(slow != fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
// TC-O(N) SC-O(1)