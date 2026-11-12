class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans = 1;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int count = 1;
            for(int j = i + 1; j < n; j++) {
                if(nums[j - 1] < nums[j]) {
                    count++; 
                    ans = Math.max(ans,count);
                }
                else {
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[j - 1] > nums[j]) {
                    count++;
                    ans = Math.max(ans, count);
                } else {
                    break;
                }
            }
        }
        return ans;
    }
}