class Solution {
    public int maxDepth(String s) {
       Stack<Character> st = new Stack<>();
       int incre = 0;
       int res = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                incre++;
                res = Math.max(res,incre);
            }
            else if(ch == ')') {
                incre--;
            }
        }
        return res;
    }
}