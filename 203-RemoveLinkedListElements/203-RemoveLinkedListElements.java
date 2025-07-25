// Last updated: 7/25/2025, 8:53:54 AM
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
    public ListNode removeElements(ListNode head, int val) {
     ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Use a pointer starting from the dummy node
        ListNode current = dummy;
        
        // Traverse the list
        while (current.next != null) {
            if (current.next.val == val) {
                // Remove the node by skipping it
                current.next = current.next.next;
            } else {
                // Move to the next node if not deleting
                current = current.next;
            }
        }
        
        // Return the new head, which is the next of the dummy node
        return dummy.next;
    }
}