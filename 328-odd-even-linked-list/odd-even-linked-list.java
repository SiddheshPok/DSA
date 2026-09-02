class Solution {
    public ListNode oddEvenList(ListNode head) 
    {
        if (head == null || head.next == null)
            return head;
        // ListNode odd = head;
        // ListNode even = head.next;
        // ListNode evenHead = even;
        // while (even != null && even.next != null) {

        //     odd.next = even.next;
        //     odd = odd.next;

        //     even.next = odd.next;
        //     even = even.next;
        // }
        // odd.next = evenHead;
        // return head;
        ListNode oddHead = new ListNode(0);
        ListNode evenHead = new ListNode(0);

        ListNode oddtail = oddHead;
        ListNode eventail = evenHead;
        int index = 1;
        while(head != null)
        {
            if(index % 2 == 0)
            {
                eventail.next = head;
                eventail = eventail.next;
            }
            else 
            {
                oddtail.next = head;
                oddtail = oddtail.next;
            }
            head = head.next;
            index++;
        }
        oddtail.next = (evenHead.next == null) ? null : evenHead.next;
        eventail.next = null;
        return oddHead.next;
    }
}