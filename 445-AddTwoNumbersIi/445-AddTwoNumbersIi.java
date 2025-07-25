// Last updated: 7/25/2025, 8:53:04 AM
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> st1 = new ArrayDeque<>();
        Deque<Integer> st2 = new ArrayDeque<>();

        while (l1 != null) {
            st1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            st2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode head = null;

        while (!st1.isEmpty() || !st2.isEmpty() || carry != 0) {
            int sum = carry;
            if (!st1.isEmpty()) sum += st1.pop();
            if (!st2.isEmpty()) sum += st2.pop();

            carry = sum / 10;
            head = new ListNode(sum % 10, head);
        }

        return head;
    }
}
