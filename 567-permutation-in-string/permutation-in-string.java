class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int count = 0;

        int s1Count[] = new int[26];
        for(char c : s1.toCharArray())
        {
            s1Count[c - 'a']++;
        }

        for(int i = 0 ; i <= n2 - n1; i++)
        {
            int s2Count[] = new int[26];
            for(int j = i; j <= i + n1 - 1; j++)
            {
                s2Count[s2.charAt(j) - 'a']++;
            }

            if(Arrays.equals(s1Count,s2Count))
            {
                count++;
            }
        }
        return count > 0;
    }
}