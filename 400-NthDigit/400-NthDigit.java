// Last updated: 7/26/2025, 9:15:47 PM
class Solution {
    public int findNthDigit(int n) {
        long len = 1, count = 9, start = 1;

        while (n > len * count) {
            n -= len * count;
            len++;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;
        String num = String.valueOf(start);
        return num.charAt((n - 1) % (int) len) - '0';
    }

}