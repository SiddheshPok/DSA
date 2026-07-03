/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean isPresent(ListNode node, ListNode headB)
    {
        ListNode b = headB;
        while(b != null)
        {
            if(b == node)
            {
                return true;
            }
            b = b.next;
        }
        return false;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        while(temp != null)
        {
            if(isPresent(temp,headB))
            {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}