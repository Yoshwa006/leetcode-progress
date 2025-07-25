// Last updated: 7/25/2025, 8:53:41 AM
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find the middle using slow and fast pointers
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode prev = null, curr = slow, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare the first half and the reversed second half
        ListNode left = head, right = prev;
        while (right != null) {  // Only need to check the second half
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        // Optional Step 4: Restore the list (Uncomment if needed)
        // reverseList(prev);  

        return true;
    }
}
