class Solution {
    public String removeOuterParentheses(String s) {
        // Stack<Character> st = new Stack<>();
        // StringBuilder ans = new StringBuilder();
        // for(char ch : s.toCharArray()) {
        //     if(ch == '(') {
        //         st.push('(');
        //     }
        //     else {
        //         if(!st.isEmpty() && st.size() != 1) {
        //             ans.append(st.pop());
        //             ans.append(')');               }
        //     }
        // }
        // return ans.toString();

        StringBuilder ans = new StringBuilder();
        int depth = 0;
        for(char ch : s.toCharArray()) { 
            if(ch == '(') {
                if(depth > 0) {
                    ans.append('(');
                }
                depth++;
            }
            else {
                depth--;
                if(depth > 0) {
                    ans.append(ch);
                }
            }
        }
        return ans.toString();

    }
}