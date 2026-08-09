class Solution {
    private boolean checkpalindrome(String s)
    {
        int l = 0;
        int r = s.length() - 1;
        while(l < r)
        {
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        int n = words.length;
        for(int i = 0; i < n; i++)
        {
            if(checkpalindrome(words[i]) == true)
            {
                return words[i];
            }
        }
        return "";
    }
}