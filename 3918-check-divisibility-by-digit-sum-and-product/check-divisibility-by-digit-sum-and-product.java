class Solution {
    private boolean caluclateDigitAns(int n)
    {
        int number = n;
        int prod = 1;
        int sum = 0;
        while(n != 0)
        {
            int digit = n % 10;
            n /= 10;
            prod *= digit;
            sum += digit;
        }
        if(number % (sum + prod) == 0)
        {
            return true;
        }
        return false;
    }
    public boolean checkDivisibility(int n) {
        return caluclateDigitAns(n);
    }
}