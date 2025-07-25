// Last updated: 7/25/2025, 8:54:11 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
           ListNode slow = head;
        ListNode fast =head;
if(head== null){
    return false;
}
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow= slow.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    }