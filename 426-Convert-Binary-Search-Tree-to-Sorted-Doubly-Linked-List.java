/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {
    Node head  = null;
        Node prev = null;
    public Node treeToDoublyList(Node root) {
        if(root == null){
            return null;
        }
        
        //inorder traversal 
        inOrderTraversal(root);

        head.left = prev;
        prev.right = head;

        return head;
    }

    public void inOrderTraversal(Node root){
        if(root == null){
            return ;
        }
        inOrderTraversal(root.left);

        if(prev==null){
            head = root;
        }
        else{
            prev.right = root;
            root.left = prev;
        }

        prev = root;
        inOrderTraversal(root.right);

    }
}