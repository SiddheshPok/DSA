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
    private int calculateAverage(TreeNode root , int total_sum[]){
        if( root == null ) return 0;
        total_sum[0] += root.val;
        int left = calculateAverage(root.left, total_sum);
        int right = calculateAverage(root.right, total_sum);
        return 1 + left + right;
    }
    public void solve(TreeNode root, int count[]) {
        if( root == null ) return ;
        int total_sum[] = new int[1];
        int ct = calculateAverage(root, total_sum);
        
        int avg = total_sum[0] / ct;
        if(avg == root.val) {
            count[0]++;
        }
        solve(root.left,count);
        solve(root.right,count);
    }

    public int averageOfSubtree(TreeNode root){
        int count[] = new int[1];
        solve(root,count);
        return count[0];
    }
}