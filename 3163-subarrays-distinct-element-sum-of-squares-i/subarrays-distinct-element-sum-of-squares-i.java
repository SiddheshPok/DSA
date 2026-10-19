class Solution {
    int sum = 0;
    public void solve(int start, int end, List<Integer> arr,
                      HashSet<Integer> set) {

        if (start == arr.size()) {
            return;
        }

        if (end == arr.size()) {
            solve(start + 1, start + 1, arr, new HashSet<>());
            return;
        }
        set.add(arr.get(end));
        sum += set.size() * set.size();
        solve(start, end + 1, arr, set);
    }
    public int sumCounts(List<Integer> nums) {
        // int n = nums.size();
        // int sum = 0;

        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         HashSet<Integer> set = new HashSet<>();
        //         for (int k = i; k <= j; k++) {
        //             set.add(nums.get(k));
        //         }
        //         sum += set.size() * set.size();
        //         set.clear();
        //     }
        // }
        // return sum;

        solve(0, 0, nums, new HashSet<>());
        return sum;
    }
}