// Last updated: 7/25/2025, 8:52:56 AM
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        ListNode kthFromStart = first;
        ListNode second = head;

        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        ListNode kthFromEnd = second;

        int temp = kthFromStart.val;
        kthFromStart.val = kthFromEnd.val;
        kthFromEnd.val = temp;

        return head;
    }
}
