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
class BSTIterator {
    List<Integer> list;
    int position =0;
    public BSTIterator(TreeNode root) {
        list = new ArrayList<>();
        inOrder(root);
    }
    
    public int next() {
        return list.get(position++);
    }
    
    public boolean hasNext() {
        return position < list.size();
    }

    public void inOrder(TreeNode root){
        if(root == null)
        return ;

        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);


    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */