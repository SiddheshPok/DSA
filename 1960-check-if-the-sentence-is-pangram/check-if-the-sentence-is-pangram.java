class Solution {
    public boolean checkIfPangram(String sentence) {
        // Map<Character,Integer> map = new HashMap<>();
        // for(int i = 0; i < sentence.length(); i++)
        // {
        //     char c = sentence.charAt(i);
        //     if(map.contains())
        //     map.put(c,map.getOrDefault(c,0) + 1);
        // }
        for(char c = 'a'; c <= 'z'; c++)
        {
            if(!sentence.contains(String.valueOf(c)))
            {
                return false;
            }
        }
        return true;
    }
}