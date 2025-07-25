// Last updated: 7/25/2025, 8:55:16 AM
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
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode ret = dummy;
        int carry =0;
        while(head1!= null || head2 != null || carry != 0){
            int sum = carry;
            
            if(head1 != null){
                sum += head1.val;
                head1= head1.next;
            }
            
            if(head2 != null){
                sum+= head2.val;
                head2= head2.next;
            }
            dummy.next =  new ListNode(sum%10);
            carry = sum /10;
            dummy = dummy.next;
        }
        return ret.next;
    }
    }
