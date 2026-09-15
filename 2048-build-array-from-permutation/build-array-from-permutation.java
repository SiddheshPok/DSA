class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for( int i = 0; i < n; i++ ) {
            int ind = nums[i];
            arr[i] = nums[ind];
        }
        return arr;
    }
}