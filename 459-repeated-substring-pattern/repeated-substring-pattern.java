class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String ss =(s+s).substring(1, (s+s).length()-1);
        return ss.contains(s);
    }
}