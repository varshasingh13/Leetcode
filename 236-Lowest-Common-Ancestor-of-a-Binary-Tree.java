class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root; // Base case
        }
        
        TreeNode left = lowestCommonAncestor(root.left, p, q); // Search in left subtree
        TreeNode right = lowestCommonAncestor(root.right, p, q); // Search in right subtree

        if (left != null && right != null) {
            return root; // If both sides found p or q, root is the LCA
        }

        return left != null ? left : right; // Return non-null side
    }
}
