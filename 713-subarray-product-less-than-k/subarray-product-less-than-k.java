class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // int n = nums.length;
        // int count = 0;
        // for(int i = 0; i < n; i++)
        // {
        //     int prod = 1;
        //     for(int j = i; j < n; j++)
        //     {
        //         prod *= nums[j];
        //         if(prod < k)
        //         {
        //             count++;
        //         }
        //         else
        //         {
        //             break;
        //         }
        //     }
        // }
        // return count;

        if (k <= 1)
            return 0;
        int n = nums.length;
        int left = 0;
        int count = 0;
        int product = 1;
        
        for(int i = 0; i < n; i++)
        {
            product *= nums[i];
            
            while(product >= k)
            {
                product /= nums[left];
                left++;
            }
            
            count += i - left + 1;
        }
        return count;
    }
}