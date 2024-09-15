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
    public boolean isValidBST(TreeNode root) {
        
        //return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
        ArrayList<Integer> l = new ArrayList<>();
        
        inOrder(root, l);
        for(int i=0; i<l.size()-1;i++){
            if(l.get(i)>=l.get(i+1)){
                return false;

            }
        }
        return true;
        
    }

   private void inOrder( TreeNode root, ArrayList<Integer> l){
    if(root != null){
   
    inOrder(root.left, l);
    l.add(root.val);
    inOrder(root.right, l);
    }
   }

    // public boolean isValidBST(TreeNode root,long min,long max){
    //     if(root == null)
    //     return true;

    //     if(root.val>=max || root.val<=min)
    //     return false;

    //     return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    // }
}