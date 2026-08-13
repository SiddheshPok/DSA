class Solution {
    private boolean ischeck(String s, String ss) 
    {
        int k = ss.length();
        int j = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            if (j < k && s.charAt(i) == ss.charAt(j)) 
            {
                j++;
            }
        }
        return j == k;
    }
    public String findLongestWord(String s, List<String> dictionary) {
        String ans = "";
        for (int i = 0; i < dictionary.size(); i++) 
        {
            String ss = dictionary.get(i);
            if (ischeck(s, ss)) 
            {
                if (ss.length() > ans.length()) 
                {
                    ans = ss;
                }
                else if (ss.length() == ans.length() && ss.compareTo(ans) < 0) 
                {
                    ans = ss;
                }
            }
        }
        return ans;
    }
}