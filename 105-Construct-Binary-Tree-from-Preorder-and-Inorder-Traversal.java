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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> inorderIndexmap = new HashMap<>();
        for(int i =0; i<inorder.length; i++ ){
            inorderIndexmap.put(inorder[i], i);
        }
        return split(inorderIndexmap, preorder, 0, 0, inorder.length-1);
    
    }

    private TreeNode split(HashMap<Integer, Integer> inorderIndexmap, int[] preorder, int rootIndex, int left, int right){

        TreeNode t= new TreeNode(preorder[rootIndex]);
        int mid = inorderIndexmap.get(preorder[rootIndex]);
        if(mid > left){
           t.left = split(inorderIndexmap, preorder, rootIndex + 1,  left, mid-1);
        }
        if(mid< right){
           t.right= split(inorderIndexmap, preorder, rootIndex + (mid - left +1),  mid+1, right);
        }

        return t;
    }
}