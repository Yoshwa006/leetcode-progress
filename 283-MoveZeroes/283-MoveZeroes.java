// Last updated: 7/25/2025, 8:53:31 AM
class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int lastNonZeroFoundAt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[lastNonZeroFoundAt++] = arr[i];
            }
        }


        while (lastNonZeroFoundAt < n) {
            arr[lastNonZeroFoundAt++] = 0;
        }
    }
}