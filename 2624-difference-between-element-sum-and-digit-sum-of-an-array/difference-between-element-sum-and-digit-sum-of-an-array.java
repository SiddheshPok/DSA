class Solution {
    private int calculateSum(int n)
    {
        int sum = 0;
        while(n != 0)
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int totalsum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += calculateSum(nums[i]);
            totalsum += nums[i];
        }
        return totalsum - sum;
    }
}