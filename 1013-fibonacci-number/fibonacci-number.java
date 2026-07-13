class Solution {
    public int fib(int n) {
        int f = 0;
        int s = 1;
        int i = 1;
        while(i <= n){
            int nn = f + s;
            f = s;
            s = nn;
            i++;
        }
        return f;
    }
}