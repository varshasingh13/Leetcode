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
    public void reorderList(ListNode head) {

         if (head == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode cur = slow;
        ListNode prev = null;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        ListNode first = head;
        ListNode  second = prev;
        while(second.next != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            first = temp1;

            second.next = first;
            second = temp2;
        }


    }
}