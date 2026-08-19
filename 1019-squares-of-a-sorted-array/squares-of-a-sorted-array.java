class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] *= nums[i];
        }
        // Arrays.sort(nums);
        // return nums;
        int i = 0;
        int j = i;
        while(i < n)
        {
            if(nums[i] > nums[j])
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
            else
            {
                j++;
            }
            if(j == n)
            {
                i++;
                j = i;
            }
        }
        return nums;
    }
}