class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;

        while (temp != null) {
            st.push(temp);
            temp = temp.next;
        }

        temp = head;
        int size = st.size();

        for (int i = 0; i < size / 2; i++) {
            ListNode last = st.pop();
            ListNode nextNode = temp.next;

            temp.next = last;
            last.next = nextNode;

            temp = nextNode;
        }
        temp.next = null;
    }
}