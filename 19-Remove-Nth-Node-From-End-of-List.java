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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==0){
            return head;
        }
        ListNode first = head;
        ListNode second = head;
        for(int i=1;i<=n;i++){
            if(first.next == null){
                return head.next;
            }
            first = first.next;
        }
        while(first.next!=null){
            first = first.next;
            second = second.next;
        }
        //second.val = second.next.val;
        second.next = second.next.next;

        return head;
    }
}