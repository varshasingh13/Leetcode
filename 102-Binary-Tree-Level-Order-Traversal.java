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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
       
        if(root == null){
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()){
            
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i =0; i<size; i++){
            
             TreeNode visited = q.poll();

            l.add(visited.val);
            if(visited.left!=null){
                q.add(visited.left);
            }
            if(visited.right!=null){
                q.add(visited.right);
            }
            }
          

            
            ans.add(l);
        }
        
        return ans;
    }
}