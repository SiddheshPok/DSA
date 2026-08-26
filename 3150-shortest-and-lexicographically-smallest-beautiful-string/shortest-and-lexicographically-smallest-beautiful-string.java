class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int ones = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '1') ones++;
            if(ones == k)
            {
                while(start < i && s.charAt(start) == '0')
                {
                    start++;
                }
                String current = s.substring(start, i + 1);
                if (ans.equals("")) 
                {
                    ans = current;
                }
                else if(current.length() < ans.length())
                {
                    ans = current;
                }
                else if(current.length() == ans.length() && current.compareTo(ans) < 0)
                {
                    ans = current;
                }
            }
            if(ones == k && s.charAt(start) == '1')
            {
                ones--;
                start++;
            }
        }
        return ans;
    }
}