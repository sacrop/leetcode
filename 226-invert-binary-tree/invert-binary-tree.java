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
    public TreeNode invertTree(TreeNode root) {
        root=invert(root);
        return root;
    }
    public TreeNode invert(TreeNode node){
        if(node==null||node.left==null&&node.right==null){
            return node;
        }
        TreeNode v=node.left;
        node.left=node.right;
        node.right=v;
        node.left=invert(node.left);
        node.right=invert(node.right);
        return node;
    }
}