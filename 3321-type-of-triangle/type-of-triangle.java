class Solution {
    public String triangleType(int[] nums) {
        if(nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0])
        {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++)
            {
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }
            int n = map.size();
            if(n == 1)
            {
                return "equilateral";
            }
            else if(n == 3)
            {
                return "scalene";
            }
            else
            {
                return "isosceles";
            }
        }
        return "none";
    }
}