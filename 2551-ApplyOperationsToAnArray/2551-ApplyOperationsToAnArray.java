// Last updated: 7/25/2025, 8:49:39 AM
class Solution {
    public int[] applyOperations(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] *= 2;
                arr[i + 1] = 0;
            }
        }

        int l = 0;
        int r = arr.length - 1;

        int pos = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[pos++] = num;
            }
        }

        while (pos < arr.length) {
            arr[pos++] = 0;
        }
        return arr;
    }
}