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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);  
    
    
    // ArrayList<Integer> arrL = new ArrayList<Integer>();
    // ArrayList<Integer> arrR = new ArrayList<Integer>();
    //  inOrder(root.left,arrL);
    //  inOrder(root.right,arrR);
    //  if(!arrL.equals(arrR)){
    //     return false;
    //  }
    //  arrL.clear();
    //  arrR.clear();
    //  preOrder(root.left,arrL);
    //  preOrder(root.right,arrR);
    //  if(!arrL.equals(arrR)){
    //     return false;
    //  }
    //  return true;
    
     }

    //  static void inOrder(TreeNode n1, ArrayList arr){
    //     if(n1 == null)
    //     return;
    //     inOrder(n1.left, arr);
    //     arr.add(n1.val);
    //     inOrder(n1.right, arr);
    //  }

    //   static void preOrder(TreeNode n1, ArrayList arr){
    //     if(n1 == null)
    //     return;
    //     arr.add(n1.val);
    //     preOrder(n1.left, arr);
    //     preOrder(n1.right, arr);
    //  }

    


     public boolean isSymmetric(TreeNode n1, TreeNode n2){
        if(n1==null && n2==null){
        return true;
        } 
        if(n1==null || n2==null){
        return false;
        }
        if(n1.val != n2.val){
        return false;
        } 
        return isSymmetric(n1.left, n2.right) && isSymmetric(n1.right, n2.left);
     }

    
    

}