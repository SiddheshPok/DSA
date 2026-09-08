class Solution 
{
    public boolean find132pattern(int[] nums) 
    {
        // int n = nums.length;
        // for( int i = 0; i < n - 2; i++ )
        // {
        //     for( int j = i + 1; j < n - 1; j++)
        //     {
        //         for( int k = j + 1; k < n; k++)
        //         {
        //             if( (i < j && j < k) && (nums[i] < nums[k] && nums[k] < nums[j]))
        //             {
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int second = Integer.MIN_VALUE;   // "2" value
        for(int i = n - 1; i >= 0; i--)
        {
            if(nums[i] < second)
            {
                return true;
            }
            while(!st.isEmpty() && nums[i] > st.peek())
            {
                second = st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}