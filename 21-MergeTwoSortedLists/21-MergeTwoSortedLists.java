// Last updated: 7/25/2025, 8:55:01 AM
class Solution {
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                current.next = h1;
                h1 = h1.next;
            } else {
                current.next = h2;
                h2 = h2.next;
            }
            current = current.next;
        }

        if (h1 != null) current.next = h1;
        if (h2 != null) current.next = h2;

        return dummy.next;
    }
}
