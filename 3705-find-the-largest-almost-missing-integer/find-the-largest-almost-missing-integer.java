class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        // k = 1
        if (k == 1) {
            int[] count = new int[51];

            for (int num : nums) {
                count[num]++;
            }

            int largestNo = -1;

            for (int num : nums) {
                if (count[num] == 1) {
                    largestNo = Math.max(largestNo, num);
                }
            }

            return largestNo;
        }

        // k = n
        if (k == n) {
            int largestNo = nums[0];

            for (int num : nums) {
                largestNo = Math.max(largestNo, num);
            }

            return largestNo;
        }

        // 1 < k < n
        int largestNo = -1;

        if (isUnique(nums, 0)) {
            largestNo = Math.max(largestNo, nums[0]);
        }

        if (isUnique(nums, n - 1)) {
            largestNo = Math.max(largestNo, nums[n - 1]);
        }

        return largestNo;
    }

    public boolean isUnique(int[] nums, int index) {
        for (int i = 0; i < nums.length; i++) {
            if (i != index && nums[i] == nums[index]) {
                return false;
            }
        }

        return true;
    }
}