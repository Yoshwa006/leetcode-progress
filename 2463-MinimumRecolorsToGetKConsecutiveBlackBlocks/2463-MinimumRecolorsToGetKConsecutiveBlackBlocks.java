// Last updated: 7/25/2025, 8:49:51 AM
class Solution {
    public int minimumRecolors(String s, int k) {
        int count = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == 'W') {
                count++;
            }
        }
        min = count;

        for (int i = k; i < s.length(); i++) {
            if (s.charAt(i - k) == 'W') {
                count--;
            }
            if (s.charAt(i) == 'W') {
                count++;
            }
            min = Math.min(min, count);
        }

        return min;
    }
}
