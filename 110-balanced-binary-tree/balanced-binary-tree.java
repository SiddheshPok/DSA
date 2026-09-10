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
    // private int calculateHeight(TreeNode root)
    // {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     Queue<TreeNode> q = new LinkedList<>();

    //     if( root == null ) return 0;
    //     q.add(root);
    //     while(!q.isEmpty())
    //     {
    //         int size = q.size();
    //         List<Integer> level = new ArrayList<>();
    //         for( int i = 0; i < size; i++ )
    //         {
    //             TreeNode node = q.poll();
    //             level.add(node.val);
    //             if(node.left != null) 
    //             {
    //                 q.add(node.left);
    //             }
    //             if(node.right != null) 
    //             {
    //                 q.add(node.right);
    //             }
    //         }
    //         ans.add(level);
    //     }
    //     return ans.size();
    // }
    // public boolean isBalanced(TreeNode root) 
    // {
    //     if( root == null ) return true;   

    //     int leftheight = calculateHeight(root.left);
    //     int rightheight = calculateHeight(root.right);
    //     int ans = Math.abs(leftheight - rightheight);
    //     if( ans > 1 )
    //     {
    //         return false;
    //     }
    //     if(!isBalanced(root.left))
    //     {
    //         return false;
    //     }
    //     if(!isBalanced(root.right))
    //     {
    //         return false;
    //     }
    //     return true;
    // }

    private int calculateDepth(TreeNode root){
        if( root == null ) return 0;
        int left = calculateDepth(root.left);
        int right = calculateDepth(root.right);
        return 1  + Math.max(left, right);
    }
    public boolean isBalanced(TreeNode root) {
        if( root == null ) return true;
        int left = calculateDepth(root.left);
        int right = calculateDepth(root.right);

        if (Math.abs(left - right) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}