class Solution {
    public long sumAndMultiply(int n) {
        // int sum = 0;
        // String s = Integer.toString(n);
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i < s.length(); i++)
        // {
        //     int nn = s.charAt(i) - '0';
        //     if(nn != 0)
        //     {
        //         sum += nn;
        //         sb.append(s.charAt(i));
        //     }
        // }
        // if (sb.length() == 0) return 0;
        // long result = Long.parseLong(sb.toString());
        // return result * sum;
        long sum = 0;
        long ans = 0;
        long num = 0;
        while(n != 0)
        {
            if(n % 10 != 0)
            {
                sum += n % 10;
                num = (num * 10) + (n % 10);
            }
            n = n / 10;
        }
        while(num != 0)
        {
            ans = (ans * 10)+ (num % 10);
            num /= 10;
        }
        return sum*ans;
    }
}