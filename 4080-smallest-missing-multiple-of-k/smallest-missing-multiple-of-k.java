class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums)
        {
            list.add(num);
        }
        int miss = k;
        while(list.contains(miss))
        {
            miss = miss + k;
        }
        return miss;
    }
}