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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        Stack<Integer> st = new Stack<>();
        while(slow != null){
            st.push(slow.val);
            slow = slow.next;
        }
        ListNode temp = head;
        while(temp != null){
            if(temp.val != st.peek()){
                return false;
            }
            else{
                st.pop();
                temp= temp.next;
            }
        }
        return true;


        // Method 2

        

        // ListNode slow = head;
        // ListNode fast = head.next;
        // while(fast != null && fast.next != null){
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // slow.next = reverse(slow.next);
        // slow = slow.next;
        // while(slow != null){
        //     if(head.val != slow.val){
        //         return false;
        //     }
        //     head = head.next;
        //     slow = slow.next;
        // }
        // return true;
    }
}