class Solution {
    public boolean checkString(String s) {
        boolean occurs = false;
        for(char ch : s.toCharArray()) {
            if(ch == 'a' && occurs) {
                return false;
            }
            else if(ch == 'b') {
                occurs = true;
            }
        }
        return true;
    }
}