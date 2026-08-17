class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        if(a + b <= c || a + c <= b || b + c <= a)
        {
            return "none";
        }
        if(a == b && b == c)
        {
            return "equilateral";
        }
        if(a != b && b != c && a != c)
        {
            return "scalene";
        }
        return "isosceles";
        // if(nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0])
        // {
        //     // HashMap<Integer,Integer> map = new HashMap<>();
        //     // for(int i = 0; i < nums.length; i++)
        //     // {
        //     //     map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        //     // }
        //     // int n = map.size();
        //     if(nums[0] == nums[1] && nums[1] == nums[2])
        //     {
        //         return "equilateral";
        //     }
        //     else if(nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2])
        //     {
        //         return "scalene";
        //     }
        //     else
        //     {
        //         return "isosceles";
        //     }
        //     // if(n == 1)
        //     // {
        //     //     return "equilateral";
        //     // }
        //     // else if(n == 3)
        //     // {
        //     //     return "scalene";
        //     // }
        //     // else
        //     // {
        //     //     return "isosceles";
        //     // }
        // }
        // return "none";
    }
}