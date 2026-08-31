class Solution 
{
    public int scoreOfString(String s) 
    {
        int score = 0;
        for(int i = 1; i < s.length(); i++)
        {
            int ch11 = (int)s.charAt(i-1);
            int ch22 = (int)s.charAt(i);
            score += Math.abs(ch11 - ch22);
        }
        return score;
    }
}