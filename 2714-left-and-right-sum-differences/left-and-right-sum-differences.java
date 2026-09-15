class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        int l_sum = 0;
        for(int i = 0; i < n; i++){
            leftSum[i] = l_sum;
            l_sum += nums[i];
        }

        int r_sum = 0;
        for(int i = n-1; i >= 0; i--){
            rightSum[i] = r_sum;
            r_sum += nums[i];
        }

        for(int i = 0; i < n; i++) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return nums;
    }
}