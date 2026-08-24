class Solution 
{
    private void findCombinations(int ind, int[] candidates, int target,
                                  List<List<Integer>> ans, List<Integer> ds) 
    {
        // Target achieved
        if (target == 0) 
        {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = ind; i < candidates.length; i++) 
        {
            // Skip duplicate elements at the same recursion level
            if (i > ind && candidates[i] == candidates[i - 1])
                continue;

            // Since array is sorted, no need to continue
            if (candidates[i] > target)
                break;

            // Choose
            ds.add(candidates[i]);

            // Move to i + 1 because each element can be used only once
            findCombinations(i + 1, candidates, target - candidates[i], ans, ds);

            // Backtrack
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        List<List<Integer>> ans = new ArrayList<>();

        // Sorting is important for duplicate handling and early break
        Arrays.sort(candidates);

        findCombinations(0, candidates, target, ans, new ArrayList<>());

        return ans;
    }
}