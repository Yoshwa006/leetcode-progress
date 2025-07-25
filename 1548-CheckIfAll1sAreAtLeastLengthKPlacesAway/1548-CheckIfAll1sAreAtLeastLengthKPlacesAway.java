// Last updated: 7/25/2025, 8:51:31 AM
class Solution {
    public boolean kLengthApart(int[] arr, int k) {
        int count = k; // Start with k to handle the first `1`

        for (int num : arr) {
            if (num == 1) {
                if (count < k) {
                    return false; // Not enough distance
                }
                count = 0; // Reset count after finding a `1`
            } else {
                count++; // Increment count for each `0`
            }
        }

        return true;
    }
}
