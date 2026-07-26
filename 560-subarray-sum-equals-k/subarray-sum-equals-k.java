class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        int pref_sum = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : nums)
        {
            pref_sum += num;
            
            if(map.containsKey(pref_sum - k))
            {
                count += map.get(pref_sum-k);
            }
            
            map.put(pref_sum,map.getOrDefault(pref_sum,0)+1);
        }
        return count;
    }
}