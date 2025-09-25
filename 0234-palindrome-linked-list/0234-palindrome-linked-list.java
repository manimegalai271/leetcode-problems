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
    public boolean isPalindrome(ListNode head) {
        String s = "";
        while(head != null)
        {
            s = s + head.val;
            head = head.next;
        }
        return palindrome(s);
    }
    public Boolean palindrome(String s)
    {
        int left = 0;
        int right = s.length()-1;
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
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
    public boolean isPalindrome(ListNode head) {
        String s = "";
        while(head != null)
        {
            s = s + head.val;
            head = head.next;
        }
        return palindrome(s);
    }
    public Boolean palindrome(String s)
    {
        int left = 0;
        int right = s.length()-1;
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}
class Main 
{
    public static void main(String[] args)
    {
        LinkedList n = new LinkedList();
        n.insert(1);
        n.insert(7);
        n.insert(2);
        n.insert(1);
        n.display();
        Boolean ans = n.isPalindrome(n.head);
        System.out.print(ans);
    }
}
*/