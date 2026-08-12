class Solution {
    public int sumOfMultiples(int n) {
        int k = 1;
        int sum = 0;
        while(k <= n)
        {
            if(k % 3 == 0 || k % 5 == 0 || k % 7 == 0)
            {
                sum += k;
            }
            k++;
        }
        return sum;
    }
}