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
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null)
        {
            list.add(curr.val);
            curr = curr.next;
        }
        int n = list.size();
        int max_sum = 0;
        for(int i = 0; i < n/2; i++)
        {
            max_sum = Math.max(max_sum,list.get(i)+list.get(n-i-1));
        }
        return max_sum;
    }
}