class Solution {
    public int countKeyChanges(String s) {
        if(s.length() == 0 || s.length() == 1) return 0;
        int count = 0;
        for(int i = 1; i < s.length(); i++)
        {
            if(!(Math.abs(s.charAt(i) - s.charAt(i -1)) == 0 || Math.abs(s.charAt(i) - s.charAt(i -1)) == 32))
            {
                count++;
            }
        }
        return count;
    }
}