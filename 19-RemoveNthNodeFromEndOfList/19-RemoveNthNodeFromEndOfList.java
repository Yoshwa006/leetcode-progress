// Last updated: 7/25/2025, 8:55:04 AM
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
        ListNode dummy = new ListNode(0);
        dummy.next= head;

        ListNode slow = dummy;
        ListNode fast = head;
        for(int i=1; i< n+1; i++){
            fast = fast.next;
        }

        while(fast!= null){
            fast = fast.next;
            slow= slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}