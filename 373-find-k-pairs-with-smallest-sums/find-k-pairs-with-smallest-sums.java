// class Solution {
//     public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
//         List<List<Integer>> list = new ArrayList<>();
//         for(int i = 0; i < nums1.length; i++) {
//             for(int j = 0; j < nums2.length; j++) {
//                 List<Integer> ls = new ArrayList<>();
//                 ls.add(nums1[i]);
//                 ls.add(nums2[j]);
//                 list.add(ls);
//             }
//         }

//         list.sort((a, b) ->
//             Integer.compare(a.get(0) + a.get(1), b.get(0) + b.get(1))
//         );

//         List<List<Integer>> ans = new ArrayList<>();
//         for(int l = 0; l < k; l++) {
//             ans.add(list.get(l));
//         }
//         return ans;
//     }
// }


class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
            return ans;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        for (int i = 0; i < Math.min(k, nums1.length); i++) {
            pq.offer(new int[]{nums1[i] + nums2[0], i, 0});
        }

        while (k-- > 0 && !pq.isEmpty()) {
            int[] curr = pq.poll();

            int i = curr[1];
            int j = curr[2];

            ans.add(Arrays.asList(nums1[i], nums2[j]));

            if (j + 1 < nums2.length) {
                pq.offer(new int[]{
                    nums1[i] + nums2[j + 1], i, j + 1
                });
            }
        }

        return ans;
    }
}