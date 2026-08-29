class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int n = operations.length;
        int total = 0;
        for(int i = 0; i < n; i++)
        {
            if(operations[i].equals("C"))
            {
                st.pop();
            }
            else if(operations[i].equals("D"))
            {
                int top = st.peek();
                st.push(top*2);
            }
            else if(operations[i].equals("+"))
            {
                int top1 = st.pop();
                int top2 = st.pop();
                st.push(top2);
                st.push(top1);
                st.push(top1 + top2);
            }
            else
            {
                int num = Integer.parseInt(operations[i]);
                st.push(num);
            }
        }
        for(int x : st)
        {
            total += x;
        }
        return total;
    }
}