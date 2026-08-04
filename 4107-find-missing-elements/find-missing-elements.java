class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // List<Integer> ans = new ArrayList<>();
        // Arrays.sort(nums);
        // int n = nums.length;
        // int min = nums[0];
        // int max = nums[n-1];
        // Set<Integer> set = new HashSet<>();
        // for (int num : nums) 
        // {
        //     set.add(num);
        // }

        // while (min <= max) 
        // {
        //     if (!set.contains(min)) 
        //     {
        //         ans.add(min);
        //     }
        //     min++;
        // }
        // return ans;


        List<Integer> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) 
        {
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int i = min; i <= max; i++) 
        {
            if (!set.contains(i)) 
            {
                ans.add(i);
            }
        }
        return ans;
    }
}