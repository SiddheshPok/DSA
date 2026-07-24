class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int n = s.length();
        // int i = 0;
        // int j = 0;
        // int size = 0;
        // HashSet<Character> set = new HashSet<>();
        // while(j < n)
        // {
        //     char ch = s.charAt(j);
        //     if(!set.contains(ch))
        //     {
        //         set.add(ch);
        //         j++;
        //     }
        //     else
        //     {
        //         size = Math.max(size,set.size());
        //         set.clear();
        //         i++;
        //         j = i;
        //     }
        // }
        // size = Math.max(size,set.size());
        // return size;


        int left = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) 
        {
            while (set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}