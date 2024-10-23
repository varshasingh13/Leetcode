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
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        //calculate length of left and right subtree 
        helper(root);
        return diameter;
    }

    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        diameter = Math.max(diameter, left + right);
        //returns the height of the current subtree,
        //The height is needed by the recursive function to calculate the       diameter at higher levels in the tree.
        return Math.max(left, right)+1;

    }
}