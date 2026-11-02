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
    private void preorder(TreeNode root,StringBuilder sb) {
        if (root == null) {
            return;
        }

        sb.append(root.val);

        if(root.left == null && root.right == null) {
            sum += Integer.parseInt(sb.toString());
        }
        preorder(root.left,sb);
        preorder(root.right,sb);
        sb.deleteCharAt(sb.length() -1);
    }
    public int sumNumbers(TreeNode root) {
        sum = 0;
        StringBuilder sb = new StringBuilder();
        preorder(root,sb);
        return sum;
    }
}