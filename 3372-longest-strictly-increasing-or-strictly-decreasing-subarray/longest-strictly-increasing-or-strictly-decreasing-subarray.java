class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        // int ans = 1;
        // int n = nums.length;
        // for(int i = 0; i < n; i++) {
        //     int count = 1;
        //     for(int j = i + 1; j < n; j++) {
        //         if(nums[j - 1] < nums[j]) {
        //             count++; 
        //             ans = Math.max(ans,count);
        //         }
        //         else {
        //             break;
        //         }
        //     }
        // }

        // for (int i = 0; i < n; i++) {
        //     int count = 1;
        //     for (int j = i + 1; j < n; j++) {
        //         if (nums[j - 1] > nums[j]) {
        //             count++;
        //             ans = Math.max(ans, count);
        //         } else {
        //             break;
        //         }
        //     }
        // }
        // return ans;

        int inc = 1;
        int dec = 1;
        int ans = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] < nums[i]) {
                inc++;
                dec = 1;
            }
            else if(nums[i - 1] > nums[i]) {
                dec++;
                inc = 1;
            }
            else {
                inc = 1;
                dec = 1;
            }
            ans = Math.max(ans,Math.max(inc,dec));
        }
        return ans;
    }
}