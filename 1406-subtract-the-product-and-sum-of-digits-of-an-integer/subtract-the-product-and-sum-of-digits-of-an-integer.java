class Solution 
{
    private int caluclateDigitAns(int n)
    {
        int prod = 1;
        int sum = 0;
        while(n != 0)
        {
            int digit = n % 10;
            n /= 10;
            prod *= digit;
            sum += digit;
        }
        return prod - sum;
    }
    public int subtractProductAndSum(int n) 
    {
        return caluclateDigitAns(n);
    }
}