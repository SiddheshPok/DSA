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
    int answer = 0;
    private int calculateHeight(TreeNode root)
    {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if( root == null ) return 0;
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for( int i = 0; i < size; i++ )
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
            ans.add(level);
        }
        return ans.size();
    }
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if( root == null ) return 0;   

        int leftheight = calculateHeight(root.left);
        int rightheight = calculateHeight(root.right);
        int ans = leftheight + rightheight;
        answer = Math.max(answer,ans);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return answer;   
    }
}