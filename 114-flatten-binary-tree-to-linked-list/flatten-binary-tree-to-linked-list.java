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
    private void preorderTraversal(TreeNode root,List<TreeNode> preOrder) {
        if(root == null) return;

        preOrder.add(root);
        preorderTraversal(root.left,preOrder);
        preorderTraversal(root.right,preOrder);
    }
    public void flatten(TreeNode root) {
        List<TreeNode> preOrder = new ArrayList<>();
        preorderTraversal(root, preOrder);

        for(int i = 0; i < preOrder.size()-1; i++) {
            preOrder.get(i).left = null;
            preOrder.get(i).right = preOrder.get(i+1);
        }
    }
}