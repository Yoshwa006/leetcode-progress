// Last updated: 7/25/2025, 8:51:09 AM
class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        var count = 0;
        for (int i = 0, j = i + m; j < arr.length; i++, j++) {
            if (arr[i] != arr[j]) count = 0;
            else if (++count == (k - 1) * m) return true;
        }
        return false;
    }
}