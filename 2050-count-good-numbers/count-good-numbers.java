class Solution {

    long MOD = 1000000007;

    public int countGoodNumbers(long n) {

        long even = (n + 1) / 2;
        long odd = n / 2;

        return (int)((powrec(5, even, 1) * powrec(4, odd, 1)) % MOD);
    }

    public long powrec(long x, long n, long ans) {

        if (n == 0) {
            return ans;
        }

        if (n % 2 == 1) {
            ans = (ans * x) % MOD;
            n--;
        } else {
            x = (x * x) % MOD;
            n /= 2;
        }

        return powrec(x, n, ans);
    }
}