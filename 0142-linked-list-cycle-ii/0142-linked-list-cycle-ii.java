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
        Set<ListNode>s = new HashSet();
        ListNode th = head;
        while(th != null)
        {
            if(s.contains(th))
            {
                return th;
            }
            s.add(th);
            th = th.next;
        }
        return null;
    }
}