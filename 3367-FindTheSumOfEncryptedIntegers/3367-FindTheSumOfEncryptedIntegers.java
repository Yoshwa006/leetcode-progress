// Last updated: 7/25/2025, 8:48:53 AM
class Solution {
    public int sumOfEncryptedInt(int[] arr) {
         int res = 0;
        for (int n : arr) {
            int mul = 0, max = 0;
            while (n != 0) {
                mul = mul * 10 + 1;
                max = Math.max(max, n % 10);
                n /= 10;
            }
            res += max * mul;
        }
        return res;
    }
}