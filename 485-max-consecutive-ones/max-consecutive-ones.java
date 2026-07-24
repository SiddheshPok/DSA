class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int n = nums.length;
        // int max_one = Integer.MIN_VALUE;
        // int count = 0;

        // for(int i = 0; i < n; i++){
        //     if(nums[i] == 1){
        //         count++;
        //     }
        //     else{
        //         max_one = Math.max(max_one,count);
        //         count = 0;
        //     }
        // }
        // max_one = Math.max(max_one,count);
        // return max_one;
        int n = nums.length;
        int count = 0;
        int max_count = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] == 1)
            {
                count++;
            }
            else
            {
                max_count = Math.max(max_count,count);
                count = 0;
            }
        }
        max_count = Math.max(max_count,count);
        return max_count;
    }
}