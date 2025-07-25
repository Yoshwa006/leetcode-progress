// Last updated: 7/25/2025, 8:54:42 AM
class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length;

        // Start from the last digit and add 1
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i] = arr[i] + 1;  // No carry, just return the array
                return arr;
            }
            arr[i] = 0;  // If the digit is 9, set it to 0 and continue to the next digit
        }

        // If we have a carry left after the most significant digit, extend the array
        int[] result = new int[n + 1];
        result[0] = 1;  // Set the most significant digit to 1
        return result;
    }
}
