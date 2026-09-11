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
class Solution 
{
    private void solveAverageLevel(TreeNode root, List<Double> ans)
    {
        if( root == null ) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            List<Integer> level = new ArrayList<>();
            double sum = 0;
            for( int i = 0; i < n; i++ )
            {
                TreeNode node = q.poll();
                level.add(node.val);
                sum += node.val;
                if(node.left != null )
                {
                    q.add(node.left);
                }
                if(node.right != null )
                {
                    q.add(node.right);
                }
            }
            double l_size = level.size();
            ans.add(sum/l_size);
        }
    }
    public List<Double> averageOfLevels(TreeNode root) 
    {
        List<Double> ans = new ArrayList<>();
        solveAverageLevel(root,ans);
        return ans;
    }
}