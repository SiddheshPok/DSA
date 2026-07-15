class Solution {
    public int sumOdd(int n)
    {
        if(n == 1) return 1;
        int sum = 0;
        int i = 1;
        int j = 0;
        while(j < n)
        {
            sum += i;
            i += 2;
            j++;
        }
        return sum;
    }

    public int sumEven(int n)
    {
        if(n == 1) return 2;
        int sum = 0;
        int i = 2;
        int j = 0;
        while(j < n)
        {
            sum += i;
            i += 2;
            j++;
        }
        return sum;
    }
    public int gcdOfOddEvenSums(int n) {
        int odd = sumOdd(n);
        int even = sumEven(n);
        int min = Math.min(odd,even);
        int ans = 1;
        for(int i = 1; i <= min; i++)
        {
            if(odd % i == 0 && even % i == 0)
            {
                ans = Math.max(ans,i);
            }
        }
        return ans;
    }
}