class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> list = new ArrayList<>();
        int ans[] = new int[2];
        int rep = 0;
        int sum = 0;
        int n = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(list.contains(grid[i][j])){
                    rep = grid[i][j];
                }
                n++;
                sum += grid[i][j];
                list.add(grid[i][j]);
            }
        }
        ans[0] = rep;
        sum -= rep;
        int total = n * (n+1) / 2;
        ans[1] = total - sum;
        return ans;
    }
}