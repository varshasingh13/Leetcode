/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
// https://www.youtube.com/watch?v=rbXeQ0E7v70
class Solution {
    public Node flatten(Node head) {
        if(head == null)
        return head;

        Node cur = head;
        while(cur!=null){
            if(cur.child!=null){
                Node next = cur.next;
                cur.next = flatten(cur.child);
                cur.next.prev = cur;
                cur.child=null;
                while(cur.next!=null){
                    cur = cur.next;
                }

                //stich
                if(next!=null){
                    cur.next = next;
                    cur.next.prev = cur;
                }
            }
            cur = cur.next;
        }
        return head;
    }
}