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

       Queue<TreeNode> q = new LinkedList<>();
    public void flatten(TreeNode root) {
        addToQueue(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            temp.left = null;
            temp.right = q.peek();
        }

    }

    private void addToQueue(TreeNode root){ 
        
        if(root == null)
        return;

        q.add(root);
        addToQueue(root.left);
        addToQueue(root.right);
    }
}