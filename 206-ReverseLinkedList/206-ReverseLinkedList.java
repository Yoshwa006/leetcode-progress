// Last updated: 7/25/2025, 8:53:53 AM
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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode temp = null;
        ListNode prev = null;

        while(curr != null){
            temp = curr.next;
            curr.next =prev;
            prev= curr;
            curr= temp;
        }
        return prev;
    }
    
}