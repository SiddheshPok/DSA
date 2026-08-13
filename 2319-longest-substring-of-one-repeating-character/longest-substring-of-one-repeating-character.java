// class Solution {
//     private int calculateSubstring(char arr[])
//     {
//         int n = arr.length;
//         int count = 1;
//         int max = 0;
//         for(int i = 1; i < n; i++)
//         {
//             if(arr[i] == arr[i-1])
//             {
//                 count++;
//             }
//             else{
//                 count = 1;
//             }
//             max = Math.max(max,count);
//         }
//         return max;
//     }
//     public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
//         int n = queryIndices.length;
//         int qn = queryCharacters.length();
//         int sn = s.length();
//         int ans[] = new int[n];
//         if(sn == 1)
//         {
//             Arrays.fill(ans,1);
//             return ans;
//         }
//         char chh[] = s.toCharArray();

//         for(int i = 0; i < n; i++)
//         {
//             int num = queryIndices[i];
//             chh[num] = queryCharacters.charAt(i);

//             ans[i] = calculateSubstring(chh);
//         }
//         return ans;
//     }
// }

class Solution {

    class Node {
        char leftChar;
        char rightChar;

        int prefix;
        int suffix;
        int best;

        Node(char leftChar, char rightChar,
             int prefix, int suffix, int best) {

            this.leftChar = leftChar;
            this.rightChar = rightChar;
            this.prefix = prefix;
            this.suffix = suffix;
            this.best = best;
        }
    }

    Node[] tree;
    char[] arr;

    private Node merge(Node left, Node right) {

        if (left == null)
            return right;

        if (right == null)
            return left;

        Node res = new Node(
            left.leftChar,
            right.rightChar,
            left.prefix,
            right.suffix,
            Math.max(left.best, right.best)
        );

        // Boundary characters are same
        if (left.rightChar == right.leftChar) {

            res.best = Math.max(
                res.best,
                left.suffix + right.prefix
            );

            // Entire left segment is same
            if (left.prefix == getLength(left)) {
                res.prefix = left.prefix + right.prefix;
            }

            // Entire right segment is same
            if (right.suffix == getLength(right)) {
                res.suffix = left.suffix + right.suffix;
            }
        }

        return res;
    }

    private int getLength(Node node) {

        // This method isn't enough to know segment length,
        // so we'll handle prefix/suffix differently below.

        return 0;
    }

    private void build(int index, int start, int end) {

        if (start == end) {

            tree[index] = new Node(
                arr[start],
                arr[start],
                1,
                1,
                1
            );

            return;
        }

        int mid = (start + end) / 2;

        build(index * 2, start, mid);
        build(index * 2 + 1, mid + 1, end);

        tree[index] = mergeNodes(
            tree[index * 2],
            tree[index * 2 + 1],
            start,
            mid,
            end
        );
    }

    private Node mergeNodes(
        Node left,
        Node right,
        int leftStart,
        int mid,
        int rightEnd
    ) {

        Node res = new Node(
            left.leftChar,
            right.rightChar,
            left.prefix,
            right.suffix,
            Math.max(left.best, right.best)
        );

        if (left.rightChar == right.leftChar) {

            res.best = Math.max(
                res.best,
                left.suffix + right.prefix
            );

            int leftLength = mid - leftStart + 1;
            int rightLength = rightEnd - mid;

            if (left.prefix == leftLength) {
                res.prefix = leftLength + right.prefix;
            }

            if (right.suffix == rightLength) {
                res.suffix = left.suffix + rightLength;
            }
        }

        return res;
    }

    private void update(
        int index,
        int start,
        int end,
        int pos,
        char ch
    ) {

        if (start == end) {

            tree[index] = new Node(
                ch,
                ch,
                1,
                1,
                1
            );

            return;
        }

        int mid = (start + end) / 2;

        if (pos <= mid) {
            update(index * 2, start, mid, pos, ch);
        } else {
            update(index * 2 + 1, mid + 1, end, pos, ch);
        }

        tree[index] = mergeNodes(
            tree[index * 2],
            tree[index * 2 + 1],
            start,
            mid,
            end
        );
    }

    public int[] longestRepeating(
        String s,
        String queryCharacters,
        int[] queryIndices
    ) {

        arr = s.toCharArray();

        int n = s.length();
        int k = queryIndices.length;

        tree = new Node[4 * n];

        build(1, 0, n - 1);

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {

            int index = queryIndices[i];
            char ch = queryCharacters.charAt(i);

            arr[index] = ch;

            update(
                1,
                0,
                n - 1,
                index,
                ch
            );

            ans[i] = tree[1].best;
        }

        return ans;
    }
}