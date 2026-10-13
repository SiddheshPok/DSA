class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long arr[] = new long[n];
        for(int i = 0; i < n; i++) {
            arr[i] = (long)nums[i] * nums[i];
        }
        Arrays.sort(arr);
        int l = 0;
        int r = n - 1;
        long sum = 0;
        while (l <= r) {
            sum += arr[r--];
            if (l <= r) {
                sum -= arr[l++];
            }
        }
        return sum;
    }
}