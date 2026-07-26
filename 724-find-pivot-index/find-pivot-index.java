class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = 0;
        for(int num : nums)
        {
            totalsum += num;
        }
        int leftsum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int rightsum = totalsum - leftsum - nums[i];
            if(leftsum == rightsum)
            {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;

        // int n = nums.length;
        // int []larr = new int[n];
        // int []rarr = new int[n];
        // larr[0] = nums[0];
        // rarr[n-1] = nums[n - 1];

        // for(int i = 1; i < n; i++){
        //     larr[i] = larr[i-1] + nums[i];
        // }
        // for(int j = n - 2; j >= 0; j--){
        //     rarr[j] = rarr[j+1] + nums[j];
        // }
        // for(int k = 0; k < n; k++){
        //     if(larr[k] == rarr[k]){
        //         return k;
        //     }
        // }
        // return -1;
    }
}