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
    List<Integer> list = new ArrayList<>();
    boolean ans = false;
    public boolean findTarget(TreeNode root, int k) {
        dfs(root,k);
        return ans;
    }

    private void dfs(TreeNode root, int k) {
        if(root == null) return;
        if(list.contains(k - root.val)) { 
            ans = true;
        }
        
        list.add(root.val);
        dfs(root.left, k);
        dfs(root.right, k);
    }
}