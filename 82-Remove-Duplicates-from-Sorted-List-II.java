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
    public ListNode deleteDuplicates(ListNode head) {
        // Create a dummy node to help with edge case handling
        ListNode dummy = new ListNode();
        ListNode ans = dummy;
        ListNode temp = head;

        // Iterate through the list
        while (temp != null) {
            // If the next node is a duplicate, skip it
            if (temp.next != null && temp.val == temp.next.val) {
                // Skip all nodes with the same value
                while (temp.next != null && temp.val == temp.next.val) {
                    temp = temp.next;
                }
                temp = temp.next;
            }else{
            // Link the current node to the result list (answer)
            ans.next = temp;
            ans = ans.next;

            // Move to the next node
            temp = temp.next;
            }
        }
         ans.next = null;
        return dummy.next;
    }
}