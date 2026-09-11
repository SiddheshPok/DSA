/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private void solve_sigZag(TreeNode root, List<List<Integer>> ans)
    {
        if( root == null ) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int no = 0;
        while(!q.isEmpty())
        {
            int n = q.size();
            List<Integer> level = new ArrayList<>();

            for( int i = 0; i < n; i++)
            {
                TreeNode node = q.poll();
                level.add(node.val);

                if(node.left != null) 
                {
                    q.add(node.left);
                }
                if(node.right != null) 
                {
                    q.add(node.right);
                }
            }
            if( no % 2 == 0)
            {
                ans.add(level);
            }
            else
            {
                Collections.reverse(level);
                ans.add(level);
            }
            no++;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        if( root == null ) return ans;
        solve_sigZag(root, ans);
        return ans;
    }
}