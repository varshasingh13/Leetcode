/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length ==0){
            return null;
        }
        ListNode temp1 = lists[0];
        ListNode temp2;
        ListNode merge;
        for(int i=1; i<lists.length; i++){
            temp2 = lists[i];
            temp1 = mergeNode(temp1, temp2);

        }
        return temp1;
    }

    private ListNode mergeNode(ListNode t1, ListNode t2){
        if(t1 == null)
        return t2;

        if (t2== null)
        return t1;

        ListNode merge = new ListNode();
        ListNode head = merge;
        while(t1!=null && t2!=null){
            if(t1.val> t2.val){
                merge.next = t2;
                merge = merge.next;
                t2 = t2.next;
            }
            else{
                merge.next = t1; 
                merge = merge.next;
                t1 = t1.next;
            }
        }
        if(t1!=null){
            merge.next = t1;
            
        }
        if(t2!=null){
            merge.next = t2;
           
        }
        return head.next;
    }
}