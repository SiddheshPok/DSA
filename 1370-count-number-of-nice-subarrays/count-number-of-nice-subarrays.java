class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        int j = 0;
        int odd = 0;
        int ans = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 == 1)
            {
                odd++;
                count = 0;
            }
            while(odd == k)
            {
                if(nums[j] % 2 == 1)
                {
                    odd--;
                }
                count++;
                j++;
            }
            ans += count;
        }
        return ans;
    }
}