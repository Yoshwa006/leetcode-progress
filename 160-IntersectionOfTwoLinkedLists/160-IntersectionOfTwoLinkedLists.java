// Last updated: 7/25/2025, 8:54:06 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        ListNode one  = head1;
        ListNode two = head2;

        while(one != two ){


            if(one == null) {
                one = head2;
            }
            else{
                one = one.next;
            }
            if(two == null) {
                two = head1;

            }
            else{
                two = two.next;
            }
        }

        return one;
    }
}