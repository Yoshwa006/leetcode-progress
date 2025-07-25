// Last updated: 7/25/2025, 8:48:21 AM
class Solution {
    public int smallestNumber(int n) {
        int k = 1;
        while (true) {
            long x = (1L << k) - 1;
            if (x >= n) return (int) x; 
            k++;
        }
    }
}
