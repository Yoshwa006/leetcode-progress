// Last updated: 7/25/2025, 8:51:01 AM
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prevA = list1;
        for(int i=0;i < a-1;i++){
            prevA = prevA.next;
        }
        ListNode prevB = list1;
        for(int i=0;i <= b;i++){
            prevB = prevB.next;
        }

        prevA.next = list2;
        ListNode t = list2;
        while(t.next != null){
            t = t.next;
        }
        t.next = prevB;
        return list1;
    }
}