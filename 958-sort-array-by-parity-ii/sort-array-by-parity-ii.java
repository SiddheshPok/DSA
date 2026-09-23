class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                even.add(nums[i]);
            }
            else {
                odd.add(nums[i]);
            }
        }

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even.get(evenIndex++);
            } 
            else {
                nums[i] = odd.get(oddIndex++);
            }
        }
        return nums;
    }
}