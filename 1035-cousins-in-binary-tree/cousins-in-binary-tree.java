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
    TreeNode xParent = null;
    TreeNode yParent = null;
    int xDepth = -1;
    int yDepth = -1;

    public void areCousins(TreeNode root, TreeNode parent, int depth, int x, int y)
    {
        if( root == null ) return;

        if( root.val == x ) {
            xParent = parent;
            xDepth = depth;
        }

        if( root.val == y ) {
            yParent = parent;
            yDepth = depth;
        }
        areCousins(root.left, root, depth+1, x, y);
        areCousins(root.right, root, depth+1, x, y);
    }
    
    public boolean isCousins(TreeNode root, int x, int y) {
        areCousins(root, null, 0, x , y);
        return (xDepth == yDepth) && (xParent != yParent);
    }
}