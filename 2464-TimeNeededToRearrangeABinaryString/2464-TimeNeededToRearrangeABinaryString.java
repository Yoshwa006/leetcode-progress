// Last updated: 7/25/2025, 8:49:49 AM
class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int time = 0;
        int zeros = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                zeros++;
            } else if (zeros > 0) {
                time = Math.max(time + 1, zeros);
            }
        }

        return time;
    }
}
