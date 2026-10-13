class Solution {
    private boolean isValid(String s) {
        int count = 0;

        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                count++;
            }
            else {
                count--;
            }
            if(count < 0) return false;
        }
        return count == 0 ? true : false;
    }
    private void generateParenthesis(String s, int n, List<String> ans) {
        if(s.length() == 2*n ){
            if(isValid(s)){
                ans.add(s);
            }
            return;
        }
        generateParenthesis(s + "(", n, ans);
        generateParenthesis(s + ")", n, ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateParenthesis("",n,ans);
        return ans;
    }
}