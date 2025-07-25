// Last updated: 7/25/2025, 8:48:19 AM
class Solution {
    public int maxAdjacentDistance(int[] arr) {

        int max = Math.abs(arr[0] - arr[arr.length - 1]);
        int d = max;
        for (int i = 1; i < arr.length; i++) {
            d = Math.abs(arr[i] - arr[i - 1]);
            if (d > max) {
                max = d;
            }
        }

        return max;
    }
}