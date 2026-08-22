class Solution {
    private boolean calculateincrement(int nums[])
    {
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i-1] > nums[i])
            {
                return false;
            }
        }
        return true;
    }
    private boolean calculatedecrement(int nums[])
    {
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i-1] < nums[i])
            {
                return false;
            }
        }
        return true;
    }
    public boolean isMonotonic(int[] nums) {
        if(nums.length <= 2)  return true;
        
        int i = 1;
        while(i < nums.length && nums[i] == nums[i - 1]) 
        {
            i++;
        }
        if(i == nums.length) return true;
        if(nums[i - 1] < nums[i])
        {
            return calculateincrement(nums);
        }
        return calculatedecrement(nums);
    }
}