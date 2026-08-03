class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        int min_diff = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++)
        {
            min_diff =  Math.min(min_diff,arr[i] - arr[i-1]);
        }

        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i] - arr[i-1] == min_diff)
            {
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return ans;
    }
}