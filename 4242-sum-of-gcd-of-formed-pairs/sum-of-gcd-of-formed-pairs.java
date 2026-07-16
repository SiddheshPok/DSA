import java.util.*;

class Solution {
    public int gcd(int a, int b) {
        while (b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int[] maxif(int nums[]) {
        int max = Integer.MIN_VALUE;
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) 
        {
            max = Math.max(max, nums[i]);
            ans[i] = max;
        }
        return ans;
    }

    public int[] prefixGcd(int nums[], int mxi[]) {
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) 
        {
            ans[i] = gcd(nums[i], mxi[i]);
        }

        return ans;
    }

    public void sortprefixgcdd(int nums[]) 
    {
        Arrays.sort(nums);
    }

    public long calculatefinal(int nums[]) {
        int l = 0;
        int r = nums.length - 1;
        long sum = 0;
        while (l < r)
        {
            sum += gcd(nums[l], nums[r]);
            l++;
            r--;
        }
        return sum;
    }

    public long gcdSum(int[] nums) 
    {
        int[] mxi = maxif(nums);
        int[] prefixgcdd = prefixGcd(nums, mxi);
        sortprefixgcdd(prefixgcdd);
        return calculatefinal(prefixgcdd);
    }
}