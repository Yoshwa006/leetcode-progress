// Last updated: 7/25/2025, 8:48:24 AM
class Solution {
    public boolean isZeroArray(int[] arr, int[][] q) {
        int[] delta = new int[arr.length + 1]; 

        for (int[] range : q) {
            int left = range[0];
            int right = range[1];

            delta[left]++;
            if (right + 1 < delta.length) {
                delta[right + 1]--;
            }
        }

        int[] ans = new int[arr.length];
        int runningSum = 0;

        for (int i = 0; i < arr.length; i++) {
            runningSum += delta[i];
            ans[i] = arr[i] - runningSum;

            if (ans[i] > 0) {
                return false;
            }
        }

        return true;
    }
}
