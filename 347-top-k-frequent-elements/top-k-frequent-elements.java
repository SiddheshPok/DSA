class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int arr[] = new int[map.size()];
        int p = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            arr[p++] = entry.getValue();
        }
        Arrays.sort(arr);
        int ans[] = new int[k];
        int s = 0;

        for (int i = arr.length - 1; i >= 0 && s < k; i--) 
        {
            int frequency = arr[i];
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
            {
                if (entry.getValue().equals(frequency)) 
                {
                    ans[s++] = entry.getKey();
                    map.remove(entry.getKey());
                    break;
                }
            }
        }
        return ans;
    }
}