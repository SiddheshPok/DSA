class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch != ')') {
                st.push(ch);
            }
            else {
                List<Character> list = new ArrayList<>();
                while(st.peek() != '(') {
                    list.add(st.pop());
                }
                st.pop();
                for(int i = 0; i < list.size(); i++) {
                    st.push(list.get(i));
                }
            }
        }
        for (char ch : st) {
            sb.append(ch);
        }
        return sb.toString();
    }
}