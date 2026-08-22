class Solution {
    public boolean checkRecord(String s) {
        int abs = 0;
        int late = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == 'A')
            {
                abs++;
            }
            if(ch == 'L')
            {
                late++;
            }
            else
            {
                late = 0;
            }
            if(abs >= 2 || late >= 3) 
            {
                return false;
            }
        }
        return true;
    }
}