// Last updated: 7/25/2025, 8:51:16 AM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int check = 1;
        for (int n : arr) {
            while (check != n) {
                k--;
                if (k == 0) return check;
                check++;
            }
            check++;
        }

        return check + k - 1;
    }
}