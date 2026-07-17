// class Solution {
//     public int gcd(int a, int b) 
//     {
//         while (b != 0)
//         {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
//     public int[] gcdValues(int[] nums, long[] queries) {
//        int n = nums.length;
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0; i < n; i++)
//        {
//         for(int j = i + 1; j < n; j++)
//         {
//             list.add(gcd(nums[i],nums[j]));
//         }
//        }
//        Collections.sort(list);
//        int n2 = queries.length;
//        int ans[] = new int[n2];
//        for(int i = 0; i < n2; i++)
//        {
//         ans[i] = list.get((int)queries[i]);
//        }
//        return ans;
//     }
// }


import java.util.*;

class Solution {

    public int[] gcdValues(int[] nums, long[] queries) {

        int max = 0;
        for (int x : nums) max = Math.max(max, x);

        int[] freq = new int[max + 1];
        for (int x : nums) freq[x]++;

        long[] cnt = new long[max + 1];

        // Count pairs whose both numbers are divisible by i
        for (int i = 1; i <= max; i++) {
            long total = 0;
            for (int j = i; j <= max; j += i) {
                total += freq[j];
            }
            cnt[i] = total * (total - 1) / 2;
        }

        // Inclusion-Exclusion:
        // cnt[i] = pairs whose gcd is exactly i
        for (int i = max; i >= 1; i--) {
            for (int j = i + i; j <= max; j += i) {
                cnt[i] -= cnt[j];
            }
        }

        // Prefix counts
        long[] prefix = new long[max + 1];
        for (int i = 1; i <= max; i++) {
            prefix[i] = prefix[i - 1] + cnt[i];
        }

        int[] ans = new int[queries.length];

        for (int k = 0; k < queries.length; k++) {
            long target = queries[k] + 1; // 0-indexed query

            int l = 1, r = max;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (prefix[mid] >= target)
                    r = mid;
                else
                    l = mid + 1;
            }

            ans[k] = l;
        }

        return ans;
    }
}