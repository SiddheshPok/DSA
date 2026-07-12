class Solution {
    int l = 0;
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int r = s.length() - 1;
        int l = 0;

        while(l < r){
            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }
            r--;
            l++;
        }  
        return true;
    //     s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    //     return check(s,0,s.length() - 1);
     }
    // boolean check(String s, int left, int right){
    //     if(left >= right) return true;
    //     if(s.charAt(left) != s.charAt(right)) return false;
    //     return check(s,left + 1,right - 1);
    // }
}