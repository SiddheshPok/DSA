class Solution {
    public int[] singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of every number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[2];
        int index = 0;

        // Find numbers occurring only once
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans[index++] = entry.getKey();
            }
        }

        return ans;
    }
}