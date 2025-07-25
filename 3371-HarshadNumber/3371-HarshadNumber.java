// Last updated: 7/25/2025, 8:48:51 AM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int n) {
        int sum = 0;
        int tem =n;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        if (tem % sum > 0) {
            return -1;
        }
        return sum;
    }
}