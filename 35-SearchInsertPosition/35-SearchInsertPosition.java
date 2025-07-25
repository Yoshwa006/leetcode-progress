// Last updated: 7/25/2025, 8:54:52 AM
class Solution {
    public int searchInsert(int[] arr, int t) {
        
            int l = 0, r = arr.length - 1;

                while (l <= r) {
                        int m = l + (r - l) / 2;

                                if (arr[m] == t) {
                                            return m; // Target found, return index
                                                    } else if (arr[m] < t) {
                                                                l = m + 1; // Search in the right half
                                                                        } else {
                                                                                    r = m - 1; // Search in the left half
                                                                                            }
                                                                                                }

                                                                                                    // If not found, return the insertion index
                                                                                                        return l;
    }
}