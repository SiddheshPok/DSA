class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        // for(int i = 0; i < words.length; i++)
        // {
        //     if(words[i].contains(String.valueOf(x)))
        //     {
        //         ans.add(i);
        //     }
        // }
        // return ans;

        for(int i = 0; i < words.length; i++)
        {
            for(int j = 0; j < words[i].length(); j++)
            {
                if(x == words[i].charAt(j))
                {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}