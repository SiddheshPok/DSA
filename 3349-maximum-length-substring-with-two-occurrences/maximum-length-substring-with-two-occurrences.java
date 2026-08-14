class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int length = 0;
        while(j < s.length())
        {
            char ch = s.charAt(j);
            if(map.getOrDefault(ch, 0) >= 2)
            {
                char left = s.charAt(i);
                map.put(left, map.get(left) - 1);
                i++;
            }
            else{
                map.put(ch,map.getOrDefault(ch,0)+1);
                j++;
            }
            length = Math.max(length, j - i);
        }
        return length;
    }
}