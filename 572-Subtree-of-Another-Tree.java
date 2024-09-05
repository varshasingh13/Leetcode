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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null)
        return false;

        if(helper(root, subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    private boolean helper(TreeNode root, TreeNode subroot){
        if(root ==null && subroot == null){
            return true;
        }

        if(root ==null || subroot == null)
        {
            return false;
        }
        if(root.val != subroot.val){
            return false;
        }
        return helper(root.right, subroot.right) && helper(root.left, subroot.left);
    }
}