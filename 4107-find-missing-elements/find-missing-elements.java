class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int min = nums[0];
        int max = nums[n-1];
        Set<Integer> set = new HashSet<>();
        for (int num : nums) 
        {
            set.add(num);
        }

        while (min <= max) 
        {
            if (!set.contains(min)) 
            {
                ans.add(min);
            }
            min++;
        }
        return ans;
    }
}