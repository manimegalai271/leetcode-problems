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
        ListNode curr = head;
        if(curr == null)return null;
        while(curr != null && curr.next != null)
        {
            if(curr.val == curr.next.val)
            {
                curr.next = curr.next.next;
            }
            else 
            {
                curr = curr.next;
            }
        }
        return head;


    }
}
/*
class ListNode 
{
    int val;
    ListNode next;
    ListNode(int val)
    {
        this.val = val;
    }
    
}
class LinkedList 
{   
    ListNode head;
    ListNode tail;
    ListNode curr;
    public void insert(int val)
    {   
        ListNode n = new ListNode(val);
        if(head == null)
        {
            head = n;
            tail = n;
            curr = n;
        }
        else 
        {
            tail.next = n;
            tail = n;
        }
    }
    
    public void display()
    {
        while(curr != null)
        {
            System.out.print(curr.val +" ");
            curr = curr.next;
        }
        System.out.println();
        curr = head;
    }
    public ListNode deleteDuplicates(ListNode head)
    {
        ListNode curr = head;
        if(curr == null)return null;
        while(curr != null && curr.next != null)
        {
            if(curr.val == curr.next.val)
            {
                curr.next = curr.next.next;
            }
            else 
            {
                curr = curr.next;
            }
        }
        return head;
    }
}
class Main 
{
    public static void main(String[] args)
    {
        LinkedList n = new LinkedList();
        n.insert(5);
        n.insert(5);
        n.insert(7);
        n.insert(10);
        n.display();
        n.deleteDuplicates(n.head);
        n.display();
        
    }
}
*/