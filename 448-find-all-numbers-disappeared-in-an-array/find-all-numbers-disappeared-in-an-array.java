class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < n ; i++)
        {
            set.add(nums[i]);
        }
        int i = 1;
        while(i <= n)
        {
            if(!set.contains(i)){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}