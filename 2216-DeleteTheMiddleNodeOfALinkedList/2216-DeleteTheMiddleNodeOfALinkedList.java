// Last updated: 7/25/2025, 8:50:13 AM
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode slow = temp;
        ListNode fast = head;

        if(head.next == null){
            return null;
        }
    
         if(head.next.next == null){
          head.next = null;
            return head;
}
        else{
            while(fast != null && fast.next!= null){
            fast = fast.next.next;
            slow =slow.next;
        }
        slow.next = slow.next.next;
    }
    return temp.next;
    }
}