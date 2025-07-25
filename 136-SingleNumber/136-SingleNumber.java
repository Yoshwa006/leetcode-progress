// Last updated: 7/25/2025, 8:54:13 AM
class Solution {
    public int singleNumber(int[] arr) {
        int f = 0;

        for (int num : arr) {
            f = num ^ f;
        }

        return f;
    }
}