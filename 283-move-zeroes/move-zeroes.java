class Solution {
    public void moveZeroes(int[] nums) {
        int arr[] = new int[nums.length];
        int k = 0;
        for(int n : nums) {
            if(n != 0) {
                arr[k++] = n;
            }
        }
        int i = 0;
        for(int n : arr) {
            nums[i++] = n;
        }
    }
}