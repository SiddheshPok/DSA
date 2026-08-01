class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int clone[] = nums.clone();
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],i);
            }
        }
        
        int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            ans[i] = map.get(clone[i]);
        }
        return ans;
    }
}