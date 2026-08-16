class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        int k = 1;
        // if(nums.length == 1 && nums[0] == 1) return 2;
        while(k <= nums.length)
        {
            if(!set.contains(k))
            {
                return k;
            }
            k++;
        }
        return k;
    }
}