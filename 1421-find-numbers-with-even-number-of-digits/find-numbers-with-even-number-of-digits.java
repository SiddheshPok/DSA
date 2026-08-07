class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;

        // String[] str = new String[nums.length];
        // for (int i = 0; i < nums.length; i++) 
        // {
        //     str[i] = String.valueOf(nums[i]);
        //     if(str[i].length() % 2 == 0) count++;
        // }
        // return count;

        for(int i = 0; i < n; i++)
        {
            String str = Integer.toString(nums[i]);
            if(str.length() % 2 == 0) count++;
        }
        return count++;
    }
}