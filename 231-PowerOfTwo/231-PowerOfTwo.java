// Last updated: 7/25/2025, 8:53:42 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n < 1 ? false : (n & (n - 1)) == 0 ? true : false;
    }
}