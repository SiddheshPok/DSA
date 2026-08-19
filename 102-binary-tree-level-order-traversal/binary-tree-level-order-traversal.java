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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans  = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return ans;
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            List<Integer> level  = new ArrayList<>();
            for(int i = 0; i < n; i++)
            {
                TreeNode treeNode = q.poll();
                level.add(treeNode.val);

                if(treeNode.left != null)
                {
                    q.add(treeNode.left);
                }
                if(treeNode.right != null)
                {
                    q.add(treeNode.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}