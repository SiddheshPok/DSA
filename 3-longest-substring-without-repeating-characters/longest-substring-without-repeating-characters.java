class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int size = 0;
        HashSet<Character> set = new HashSet<>();
        while(j < n)
        {
            char ch = s.charAt(j);
            if(!set.contains(ch))
            {
                set.add(ch);
                j++;
            }
            else
            {
                size = Math.max(size,set.size());
                set.clear();
                i++;
                j = i;
            }
        }
        size = Math.max(size,set.size());
        return size;
        
    }
}