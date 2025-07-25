// Last updated: 7/25/2025, 8:50:53 AM
class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] numArr = new int[101];
        for (int number : nums) {
            numArr[number]++;
        }

        for (int number : nums) {
            if (numArr[number] == 1) sum+=number;
        }

        return sum;    
    }
}