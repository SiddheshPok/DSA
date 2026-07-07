class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            int nn = s.charAt(i) - '0';
            if(nn != 0)
            {
                sum += nn;
                sb.append(s.charAt(i));
            }
        }
        if (sb.length() == 0) return 0;
        long result = Long.parseLong(sb.toString());
        return result * sum;
    }
}