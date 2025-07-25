// Last updated: 7/25/2025, 8:55:14 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        
        int medianIndex1 = (totalLength - 1) / 2; // First median index
        int medianIndex2 = totalLength / 2;     // Second median index (for even lengths)

        int i = 0, j = 0; // Pointers for nums1 and nums2
        int count = 0;
        int current = 0, previous = 0; // Store current and previous elements for median calculation

        while (count <= medianIndex2) {
            previous = current; // Keep track of the previous element

            if (i < m && (j >= n || nums1[i] <= nums2[j])) {
                current = nums1[i++];
            } else {
                current = nums2[j++];
            }
            count++;
        }

        // If total length is odd, return the middle element
        if (totalLength % 2 == 1) {
            return current;
        }

        // If total length is even, return the average of two middle elements
        return (current + previous) / 2.0;
    }
}
