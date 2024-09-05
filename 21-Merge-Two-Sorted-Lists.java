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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // if(list1==null)
        // return list2;

        // if(list2==null)
        // return list1;

        // ListNode temp,head;

        // if(list1.val < list2.val){
        //     temp=head=list1;
        //     list1 = list1.next;
        // }
        // else{
        //     temp=head=list2;
        //     list2= list2.next;
        // }
        

        // while(list1!=null && list2!=null){
        //     if(list1.val < list2.val){
        //         temp.next = list1;
        //         list1= list1.next;
        //     }
        //     else if(list2.val < list1.val){
        //         temp.next = list2;
        //         list2= list2.next;
        //     }
        //    temp=temp.next;
        // }
         
        // while(list1!=null){
        //     temp.next= list1;
        //     list1 = list1.next;
        //     temp = temp.next;
        // }
        //  while(list2!=null){
        //     temp.next= list2;
        //     list2 = list2.next;
        //     temp = temp.next;
        // }
        // return head;


        if (l1 == null) return l2;
    if (l2 == null) return l1;

    ListNode dummy = new ListNode(-1);
    ListNode curr = dummy;

    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        curr.next = l1;
        l1 = l1.next;
      } else {
        curr.next = l2;
        l2 = l2.next;
      }
      curr = curr.next;
    }

    if (l1 != null) {
      curr.next = l1;
    }

    if (l2 != null) {
      curr.next = l2;
    }


    // while(l1!=null){
    //         curr.next = l1;
    //         l1 = l1.next;
    //         curr = curr.next;
    //     }
    //      while(l2!=null){
    //         curr.next = l2;
    //         l2 = l2.next;
    //         curr = curr.next;
    //     }
        
    return dummy.next;

    }
}