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


 /*

Approach:
BFS with a Twist:
Use a queue for breadth-first traversal (BFS).
Use a boolean flag to toggle the direction for each level:
If the flag is true, traverse the level from left to right.
If the flag is false, traverse the level from right to left.

Steps:
Initialize a queue that stores nodes along with their level.
For each level, process all nodes and store their values in a list.
After processing each level, reverse the list if the direction is from right to left.
Toggle the direction flag for the next level.

 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        if(root == null){
            return ans;
        }
        boolean leftToRight = true;
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<Integer>();
           
            int size = q.size();

            for(int i=0; i<size; i++){
                 TreeNode node = q.poll();
                 l.add(node.val);
                 if(node.left!=null){
                    q.offer(node.left);
                 }
                 if(node.right!=null){
                    q.offer(node.right);
                 }
            }
            if(!leftToRight){
                Collections.reverse(l);
            }
            leftToRight = !leftToRight;
            ans.add(l);

        }
        return ans;
    }

   

    
}