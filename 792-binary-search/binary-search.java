class Solution {
    private int searchByBinary(int low, int high, int[] nums, int target) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if(nums[mid] == target) return mid;
        if(nums[mid] > target){
             return searchByBinary(low,mid-1,nums,target);
        }
        else{
            return searchByBinary(mid+1,high,nums,target);
        } 
    }
    public int search(int[] nums, int target) {
        return searchByBinary(0,nums.length-1,nums,target);
    }
}