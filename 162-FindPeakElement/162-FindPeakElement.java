// Last updated: 7/25/2025, 8:54:05 AM
class Solution {
    public int findPeakElement(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;

            // Check if mid is a peak
            if ((m == 0 || arr[m] > arr[m - 1]) && (m == arr.length - 1 || arr[m] > arr[m + 1])) {
                return m;
            }

            // Move towards the larger neighbor
            if (m > 0 && arr[m - 1] > arr[m]) {
                r = m - 1; // Move left
            } else {
                l = m + 1; // Move right
            }
        }

        // At the end, l and r converge to a peak
        return l;
    }
}
