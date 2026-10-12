class Solution {
    int count = 0;
    private void isSubsequence(int ind, int[] nums, int n, int sum, int target) {
        if(ind == n) {
            if(sum == target) count++;
            return;
        }
        isSubsequence(ind+1,nums,n,sum+nums[ind],target);
        isSubsequence(ind+1,nums,n,sum-nums[ind],target);
        
    }
    public int findTargetSumWays(int[] nums, int target) {
        isSubsequence(0,nums,nums.length,0,target);
        return count;
    }
}