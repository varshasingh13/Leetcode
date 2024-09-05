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
    int ans =0, i=0;
    public int kthSmallest(TreeNode root, int k) {
        //int count =0;
       // Stack<Integer> st = new Stack<>();
         helper(root, k);
         return ans;
         
    }
    private void helper(TreeNode root, int k){
        if(root==null ){
            return ;
        }
             helper(root.left, k);
             i++;
           if(i==k){
            ans = root.val;
            return;
           }
             helper(root.right, k);
    }
}