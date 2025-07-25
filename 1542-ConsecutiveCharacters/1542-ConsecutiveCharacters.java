// Last updated: 7/25/2025, 8:51:33 AM
class Solution {
    public int maxPower(String s) {
        int cur = 1, max = 1; // Start cur and max at 1 since the minimum length of a substring is 1

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cur++;
            } else {
                max = Math.max(cur, max);
                cur = 1; // Reset count for a new sequence
            }
        }

        // Update max for the last sequence
        max = Math.max(cur, max);

        return max;
    }
}
