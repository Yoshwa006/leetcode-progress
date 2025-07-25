// Last updated: 7/25/2025, 8:52:24 AM
class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int l = 0, r = arr.length - 1;
        int count = 0;

        while (l <= r) {
            if (arr[l] + arr[r] <= limit) {
                l++;
            }
            r--;
            count++;
        }

        return count;
    }
}