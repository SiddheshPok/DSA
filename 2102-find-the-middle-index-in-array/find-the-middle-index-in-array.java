class Solution {
    public int findMiddleIndex(int[] nums) 
    {
        int n = nums.length;
        int leftsum = 0;
        int total_sum = 0;

        for( int num : nums )
        {
            total_sum += num;
        }

        for( int i = 0; i < n; i++ )
        {
            int right_sum = total_sum - leftsum - nums[i];
            if( leftsum == right_sum) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}