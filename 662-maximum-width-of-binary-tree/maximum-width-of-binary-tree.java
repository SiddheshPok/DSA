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

class Node{
    TreeNode treeNode;
    int pos;

    Node(TreeNode treeNode, int pos){
        this.treeNode = treeNode;
        this.pos =pos;
    }

}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        int result = 0;
        q.offer(new Node(root, 0));
        while(!q.isEmpty()){
            int size = q.size();
            int start = 0;
            int end = 0;
            for(int i = 0; i < size; i++){
                Node node = q.poll();
                if(i == 0) start = node.pos;
                if(i == size -1){
                 end = node.pos;
                 result = Math.max(result, end - start + 1);
                }
                if(node.treeNode.left != null){
                    q.offer(new Node(node.treeNode.left, 2 * node.pos));
                }
                if(node.treeNode.right != null){
                    q.offer(new Node(node.treeNode.right, 2 * node.pos + 1));
                }
            }
        }
        return result;
    }
}