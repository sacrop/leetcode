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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst=new ArrayList<>();
       inorders(root,lst);
        return lst;
    }
    public void inorders(TreeNode node,List<Integer> lst){
        if(node==null){
            return ;
        }
        inorders(node.left,lst);
        lst.add(node.val);
        inorders(node.right,lst);
    }
}