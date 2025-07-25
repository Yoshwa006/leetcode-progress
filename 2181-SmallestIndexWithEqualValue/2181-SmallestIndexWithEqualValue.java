// Last updated: 7/25/2025, 8:50:15 AM
class Solution {
    public int smallestEqual(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (i % 10 == arr[i] && i < min) {
                return i;
            }
        }

        return -1;
    }
}