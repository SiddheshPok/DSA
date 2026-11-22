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
    private void inorderTraversal(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        Collections.sort(list);
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i < list.size(); i++) {
            ans = Math.min(ans,list.get(i) - list.get(i-1));
        }
        return ans;
    }
}