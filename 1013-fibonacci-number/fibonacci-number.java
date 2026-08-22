class Solution 
{
    public int fib(int n) 
    {
        // int f = 0;
        // int s = 1;
        // int i = 1;
        // while(i <= n){
        //     int nn = f + s;
        //     f = s;
        //     s = nn;
        //     i++;
        // }
        // return f;
        if(n <= 1) return n;
        return fib(n-1)+fib(n-2);
    }
}