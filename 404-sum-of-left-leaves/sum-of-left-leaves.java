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
    int sum = 0;
    private void preOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        if (root.left != null &&
            root.left.left == null &&
            root.left.right == null) {

            sum += root.left.val;
        }
        preOrder(root.left);
        preOrder(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || (root.right == null && root.left == null)) return 0;
        sum = 0;
        preOrder(root);
        return sum;
    }
}