class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        int k = 0;
        int o = n;
        for( int i = 0; i < nums.length; i++ )
        {
            if( i % 2 == 0 )
            {
                ans[i] = nums[k];
                k++;
            }
            else 
            {
                ans[i] = nums[o];
                o++;
            }
        }
        return ans;
    }
}