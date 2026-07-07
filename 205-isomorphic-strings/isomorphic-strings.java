class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sToTMap = new HashMap<>();
        HashMap<Character,Character> tTosMap = new HashMap<>();
        int n = s.length();
        for(int i = 0; i < n; i++)
        {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if(!sToTMap.containsKey(s1))
            {
                sToTMap.put(s1,t1);
            }
            if(!tTosMap.containsKey(t1))
            {
                tTosMap.put(t1,s1);
            }
            if(sToTMap.get(s1) != t1 || tTosMap.get(t1) != s1)
            {
                return false;
            }
        }
        return true;
    }
}