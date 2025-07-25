// Last updated: 7/25/2025, 8:51:45 AM
class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int number: nums) {
            if ((number > 9 && number < 100) || (number > 999 && number < 10000) || (number == 100000)) result++;
        }
        return result;
    }
}