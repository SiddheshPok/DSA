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
    public ListNode rotateRight(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null)
        {
            list.add(curr.val);
            curr = curr.next;
        }
        int arr[] = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            arr[i] = list.get(i);
        }
        int ans[] = new int[list.size()];
        int n = arr.length;
        for(int i = 0; i < list.size(); i++)
        {
            ans[(i+k)% n] = arr[i];
        }
        ListNode dummy = new ListNode(0);
        curr = dummy;

        for (int i = 0; i < n; i++) 
        {
            curr.next = new ListNode(ans[i]);
            curr = curr.next;
        }

        return dummy.next;
    }
}