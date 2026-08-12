class Solution {
    public boolean isSubsequence(String s, String t) {
        // int ns = s.length();
        // int nt = t.length();
        // int k = 0;
        // int count = 0;

        // for(int i = 0; i < nt; i++)
        // {
        //     char ch = t.charAt(i);
        //     if(s.contains(String.valueOf(ch)))
        //     {
        //         if(ch == s.charAt(k))
        //         {
        //             k++;
        //             count++;
        //         }
        //     }
        // }
        // return count == ns;

        int k = 0;
        for(int i = 0; i < t.length(); i++)
        {
            if(k < s.length() && t.charAt(i) == s.charAt(k))
            {
                k++;
            }
            if(k == s.length())
            {
                return true;
            }
        }
        return s.length() == k;
    }
}