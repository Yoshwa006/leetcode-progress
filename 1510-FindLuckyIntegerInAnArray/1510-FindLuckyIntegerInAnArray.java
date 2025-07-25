// Last updated: 7/25/2025, 8:51:37 AM
class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int count = 1;

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count == arr[i]) {
                    return arr[i];
                }
                count = 1;
            }
        }

        if (count == arr[0]) {
            return arr[0];
        }

        return -1;
    }
}